package net.byfuglien.torrentsorter;


import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.google.common.io.Files;

import javax.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

public class TorrentSorter {
    public static void main(String[] args) {

        validateInputArguments(args);

        File sourceDir = new File(args[0]);
        File destinationDir = new File(args[1]);
        TorrentSorter torrentSorter = new TorrentSorter();

        Collection<File> tvshows = torrentSorter.getTvShows(Lists.newArrayList(sourceDir.listFiles()));

        torrentSorter.moveFiles(tvshows, new File(destinationDir, "shows"));

        Collection<File> unsortedStuff = Lists.newArrayList(sourceDir.listFiles());
        torrentSorter.moveFiles(unsortedStuff, new File(destinationDir, "movies"));


        /*
         * hvis tror det er tv show, legg til i shows lista, kanskje også lese basert på regexp liste som sendes inn?
            * har imdb eller andre en resttjeneste man kan spørre?
        *  Kanskje også gjøre det for musikk
        *  Sende mail til meg selv om status hver gang jobben er kjørt og noe er flyttet
        *
        * */
    }

    private static void validateInputArguments(String[] args) {
        System.out.println("args.length = " + args.length);
        if (args.length != 2) {
            throw new RuntimeException("Missing parameters, need both source and target folder\n" +
                    "Usage: java TorrentSorter <srcFolder> <targetFolder>");
        }
    }

    protected Boolean isDryRunModeSet() {
        String dryrunProperty = System.getProperty("dryrunEnabled");
        return dryrunProperty != null ? Boolean.valueOf(dryrunProperty) : false;
    }

    protected void moveFiles(Collection<File> files, File destinationDir) {
        for( File file : files) {
            try {
                System.out.println("Moving file " + file.getAbsolutePath() + " to " + destinationDir + "/" + file.getName());
                Files.move(file, new File(destinationDir, file.getName()));
            } catch (IOException ioe) {
                throw new RuntimeException("Error while accessing files to move", ioe);
            }
        }
    }


    protected Collection<File> getTvShows(List<File> files) {
//heu
        final List<String> showPatterns = Lists.newArrayList();
        showPatterns.add("(.*)season(.*)");
        showPatterns.add("(.*)s[\\d{2}](.*)e[\\d{2}](.*)");

        Collection<File> tvShows = Collections2.filter(files, new Predicate<File>() {
            @Override
            public boolean apply(@Nullable File f) {
                for (String showPattern : showPatterns) {
                    if (Pattern.matches(showPattern, f.getName().toLowerCase())) {
                        return true;
                    }
                }
                return false;
            }
        });
        return tvShows;
    }
}
