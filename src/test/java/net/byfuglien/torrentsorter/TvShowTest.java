package net.byfuglien.torrentsorter;

import com.google.common.collect.Lists;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
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
        assertEquals(7, new TorrentSorter().getTvShows(files).size());
    }

    @Test
    public void testMoveFiles() throws IOException {
        Collection<File> files = Lists.newArrayList();
        for (int i = 0; i < 3; i++) {
            files.add(File.createTempFile("junitSrcFile", "txt"));
        }

        File srcDirToMove = Files.createTempDirectory("junitSrcDir").toFile();
        FileUtils.touch(new File(srcDirToMove, "fileInFolder.txt"));
        files.add(srcDirToMove);
        new TorrentSorter().moveFiles(files, Files.createTempDirectory("junitDestDir").toFile());
    }
}
