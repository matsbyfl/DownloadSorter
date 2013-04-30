package net.byfuglien.torrentsorter;


import com.google.common.collect.Lists;
import org.apache.commons.io.FileUtils;

import javax.swing.*;
import java.io.File;
import java.util.List;

public class TorrentSorter {
    public static void main(String[] args) {
        System.out.println("length " + args.length);

        List<String> tvshows = Lists.newArrayList();

        if (args.length != 2) {
            throw new RuntimeException("Missing parameters, need both source and target folder\nUsage: java TorrentSorter <srcFolder> <targetFolder>");
        }

        File sourceDir = new File(args[0]);
        File destinationDir = new File(args[1]);

        if( sourceDir.isDirectory() ) {
            for (File file : sourceDir.listFiles()) {
                if( isTvShow(file)){

                }


            }
        }



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

    private static boolean isTvShow(File file) {
        return false;

    }
}
