package net.byfuglien.torrentsorter;


public class TorrentSorter {
    public static void main(String[] args) {
        System.out.println("length " + args.length);

        if (args.length != 2) {
            throw new RuntimeException("Missing parameters, need both source and target folder\nUsage: java TorrentSorter <srcFolder> <targetFolder>");
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
}
