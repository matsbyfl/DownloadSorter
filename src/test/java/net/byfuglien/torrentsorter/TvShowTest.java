package net.byfuglien.torrentsorter;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.io.File;
import java.util.Collection;
import java.util.List;

/**
 * User: mats Date: 5/6/13 Time: 11:23 PM
 */
public class TvShowTest {
    @Test
    public void testIsTvShow() {
        List<File> files = Lists.newArrayList();
        files.add(new File("Chuck Season 3"));
        files.add(new File("Deadwood_201.avi"));
        files.add(new File("Californication.S05E12.HDTV.RM-ASAP.3gp"));
        files.add(new File("Fringe.S04E03.720p.HDTV.X264-DIMENSION.mkv"));
        files.add(new File("Last.Resort.S01E04.720p.HDTV.X264-DIMENSION.mkv"));
        files.add(new File("South.Park.S16E05.HDTV.x264-2HD.mp4"));
        files.add(new File("Terra.Nova.S01E03.720p.HDTV.X264-DIMENSION.mkv"));
        files.add(new File("motorjournalen.s15e05.avi"));
        files.add(new File("Amistad.1997.DVD-Rip.XviD"));
        files.add(new File("Bachelorette 2012 HDRip XViD-sC0rp"));
        Collection<File> shows = TorrentSorter.getTvShows(files);
        for (File show : shows) {
            System.out.println("show = " + show);
        }

        System.out.println("Got " + shows.size() + " show matches");
    }
}
