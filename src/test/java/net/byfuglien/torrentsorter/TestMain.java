package net.byfuglien.torrentsorter;

import com.google.gag.annotation.disclaimer.WrittenWhile;
import com.google.gag.annotation.enforceable.AnswerToTheUltimateQuestionOfLifeTheUniverseAndEverything;
import org.junit.Test;
import com.google.gag.*;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TestMain {


    @Test
    public void testMain() {
        RunMain(new String[]{});
        RunMain(new String[]{"FirstArg", "SecondArg", "ThirdArg"});
    }



    @WrittenWhile("Watching Amazing race on TV")
    private void RunMain(String[] args) {
        try {
            TorrentSorter.main(args);
        } catch (RuntimeException re) {
            assertNotNull(re);
            assertTrue(re.getMessage().contains("Missing parameters"));
        }
    }

}
