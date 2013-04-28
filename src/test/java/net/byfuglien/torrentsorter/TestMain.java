package net.byfuglien.torrentsorter;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TestMain {


    @Test
    public void testMainNOArguments() {
        RunMain(new String[]{});
        RunMain(new String[]{"FirstArg", "SecondArg", "ThirdArg"});
        TorrentSorter.main(new String[]{"FirstArg", "SecondArg"});
    }

    private void RunMain(String[] args) {
        try {
            TorrentSorter.main(args);
        } catch (RuntimeException re) {
            assertNotNull(re);
            assertTrue(re.getMessage().contains("Missing parameters"));
        }
    }

}
