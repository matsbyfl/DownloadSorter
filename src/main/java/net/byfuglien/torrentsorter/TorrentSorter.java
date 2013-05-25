package net.byfuglien.torrentsorter;


import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.sun.istack.internal.Nullable;

import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

public class TorrentSorter {
    public static void main(String[] args) {
        System.out.printf("length %d%n", args.length);

        List<File> tvshows = Lists.newArrayList();

        if (args.length != 2) {
            throw new RuntimeException("Missing parameters, need both source and target folder\nUsage: java TorrentSorter <srcFolder> <targetFolder>");
        }


        File sourceDir = new File(args[0]);
        File destinationDir = new File(args[1]);

//        if (sourceDir.isDirectory()) {
//            for (File file : sourceDir.listFiles()) {
//                if (isTvShow(file)) {
//                    tvshows.add(file);
//                }
//
//
//            }
//        }



        /*
        * Src og dest som inputparametre
        * Iterere over src mappen
         * lage en liste shows alt som ligger i default gjøres det ikke noe med
         * hvis tror det er tv show, legg til i shows lista, kanskje også lese basert på regexp liste som sendes inn?
            * rekursivt. Hvis mappe, ser mappenavnet ut som et serienavn?
            * har imdb eller andre en resttjeneste man kan spørre?
            *

        *  itere over listene og plassere i mapper i target shows
        *  Kanskje også gjøre det for musikk
        *  Sende mail til meg selv om status hver gang jobben er kjørt og noe er flyttet
        *
        * */
    }


    protected static Collection<File> getTvShows(List<File> files) {

        final List<String> showPatterns = Lists.newArrayList();

        //boolean match = false;
        showPatterns.add("(.*)season(.*)");
        showPatterns.add("(.*)s[\\d{2}](.*)e[\\d{2}](.*)");

        Collection<File> tvShows = Collections2.filter(files, new Predicate<File>() {
            @Override
            public boolean apply(@Nullable File f) {
                for (String showPattern : showPatterns) {
                    //System.out.println("showPattern + f.getName().toLowerCase() = " + showPattern + " " + f.getName().toLowerCase());
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
