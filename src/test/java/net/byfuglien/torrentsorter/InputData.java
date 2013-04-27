package net.byfuglien.torrentsorter;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * User: mats Date: 4/18/13 Time: 10:26 PM
 */
public class InputData {
    public File buildTestDataStructure() {

        try {
            Path path = Files.createTempDirectory("unitTest");
            File parentDir = path.toFile();
            File alcatraz = new File(parentDir, "Alcatraz S01E08 480p WEB-DL XviD DD5 1-LTRG[ettv]");
            FileUtils.touch(new File(alcatraz, "LTRG.nfo"));
            FileUtils.touch(new File(alcatraz, "Torrent Downloaded From ExtraTorrent.com.txt"));
            FileUtils.touch(new File(alcatraz, "Alcatraz (2012) S01E08 480p WEB-DL XviD DD5.1-LTRG.avi"));
            FileUtils.touch(new File(alcatraz, "screens"));
            FileUtils.touch(new File(alcatraz, "Thumbs.db"));
            File btd = new File(parentDir, "Bored To Death Season 1 Complete 720p");
            FileUtils.touch(new File(btd, "Bored.To.Death.S01E08.720p.HDTV.x264.mkv"));
            FileUtils.touch(new File(btd, "Bored.To.Death.S01E09.720p.HDTV.x264.mkv"));
            FileUtils.touch(new File(btd, "Bored.To.Death.S01E10.720p.HDTV.x264.mkv"));
            FileUtils.touch(new File(btd, "Bored.To.Death.S01E11.720p.HDTV.x264.mkv"));
            File chuck = new File(parentDir, "Chuck Season 3");
            FileUtils.touch(new File(chuck, "Chuck - 03x09 - Chuck vs. the Beard.srt"));
            FileUtils.touch(new File(chuck, "Chuck - 03x10 - Chuck vs. the Tic Tac.mkv"));
            FileUtils.touch(new File(chuck, "Chuck - 03x10 - Chuck vs. the Tic Tac.srt"));
            FileUtils.touch(new File(chuck, "Chuck - 03x11 - Chuck Versus the Final Exam.mkv"));
            FileUtils.touch(new File(chuck, "Chuck - 03x11 - Chuck Versus the Final Exam.srt"));
            FileUtils.touch(new File(chuck, "Chuck - 03x12 - Chuck Versus the American Hero.mkv"));
            FileUtils.touch(new File(chuck, "Chuck - 03x12 - Chuck Versus the American Hero.srt"));
            FileUtils.touch(new File(chuck, "Chuck - 03x14 - Chuck Versus the Honeymooners.mkv"));
            FileUtils.touch(new File(chuck, "Chuck - 03x14 - Chuck Versus the Honeymooners.srt"));
            FileUtils.touch(new File(chuck, "Chuck - 03x15 - Chuck Versus the Role Models.mkv"));
            FileUtils.touch(new File(chuck, "Chuck - 03x15 - Chuck Versus the Role Models.srt"));
            FileUtils.touch(new File(chuck, "Chuck - 03x16 - Chuck vs. the Tooth.mkv"));
            FileUtils.touch(new File(chuck, "Chuck - 03x16 - Chuck vs. the Tooth.srt"));
            FileUtils.touch(new File(chuck, "Chuck - 03x17 - Chuck vs the living dead.mkv"));
            FileUtils.touch(new File(chuck, "Chuck - 03x17 - Chuck vs the living dead.srt"));
            FileUtils.touch(new File(chuck, "Chuck - 03x18 - Chuck vs. the Subway.mkv"));
            FileUtils.touch(new File(chuck, "Chuck - 03x18 - Chuck vs. the Subway.srt"));
            FileUtils.touch(new File(chuck, "Chuck - 03x19 - Chuck vs. the Ring.mkv"));
            FileUtils.touch(new File(chuck, "Chuck - 03x19 - Chuck vs. the Ring.srt"));
            FileUtils.touch(new File(chuck, "Chuck - 3x04 - Chuck vs Operation Awesome.srt"));
            FileUtils.touch(new File(chuck, "Chuck - 3x05 - Chuck vs First Class.srt"));
            FileUtils.touch(new File(chuck, "Chuck - 3x06 - Chuck vs The Nacho Sampler.mkv"));
            FileUtils.touch(new File(chuck, "Chuck - 3x06 - Chuck vs The Nacho Sampler.srt"));
            FileUtils.touch(new File(chuck, "Chuck - 3x13 - Chuck Versus The Other Guy.mkv"));
            FileUtils.touch(new File(chuck, "Chuck - 3x13 - Chuck Versus The Other Guy.srt"));
            File deadwood = new File(parentDir, "Deadwood S02");
            FileUtils.touch(new File(deadwood, "Deadwood_201.avi"));
            FileUtils.touch(new File(deadwood, "Deadwood_202.avi"));
            FileUtils.touch(new File(deadwood, "Deadwood_203.avi"));
            FileUtils.touch(new File(deadwood, "Deadwood_204.avi"));
            FileUtils.touch(new File(deadwood, "Deadwood_205.avi"));
            FileUtils.touch(new File(deadwood, "Deadwood_206.avi"));
            FileUtils.touch(new File(deadwood, "Deadwood_207.avi"));
            FileUtils.touch(new File(deadwood, "Deadwood_208.avi"));
            FileUtils.touch(new File(deadwood, "Deadwood_209.avi"));
            FileUtils.touch(new File(deadwood, "Deadwood_210.avi"));
            FileUtils.touch(new File(deadwood, "Deadwood_211.avi"));
            FileUtils.touch(new File(deadwood, "Deadwood_212.avi"));
            FileUtils.touch(new File(deadwood, "Thumbs.db"));
            FileUtils.touch(new File(deadwood, "Torrent downloaded from Demonoid.com.txt"));
            File fs = new File(parentDir, "Falling Skies Season 1");
            FileUtils.touch(new File(fs, "Falling.Skies.S01E01-02.HDTV.XviD-ASAP.Live and Learn.+.The Armory.avi"));
            FileUtils.touch(new File(fs, "Falling.Skies.S01E01-02.HDTV.XviD-ASAP.Live and Learn.+.The Armory.avi"));
            FileUtils.touch(new File(fs, "Falling.Skies.S01E03.HDTV.XviD-ASAP.Prisoner.of.War.avi"));
            FileUtils.touch(new File(fs, "Falling.Skies.S01E04.HDTV.XviD-FQM.Grace.avi"));
            FileUtils.touch(new File(fs, "Falling.Skies.S01E05.HDTV.XviD-FQM.Silent.Kill.avi"));
            FileUtils.touch(new File(fs, "Falling.Skies.S01E06.HDTV.XviD-ASAP.Sactuary.(Part1).avi"));
            FileUtils.touch(new File(fs, "Falling.Skies.S01E07.HDTV.XviD-ASAP.Sactuary.(Part2).avi"));
            FileUtils.touch(new File(fs, "Falling.Skies.S01E08.PROPER.HDTV.XviD-FQM.What.Hides.Beneath.avi"));
            FileUtils.touch(new File(fs, "Falling.Skies.S01E09.HDTV.XviD-FQM.Mutiny.avi"));
            FileUtils.touch(new File(fs, "Falling.Skies.S01E10.REPACK.HDTV.XviD-P0W4.Eight.Hours.avi"));
            FileUtils.touch(new File(fs, "KABLAM!!!.txt"));
            FileUtils.touch(new File(fs, "TFT_KABLAM!!!-TorchwoodMiracleDay.mp4"));
            FileUtils.touch(new File(fs, "The River - ABC Network.mp4"));
            FileUtils.touch(new File(fs, "Thumbs.db"));
            FileUtils.touch(new File(fs, "manOtor'sKABLAM!!!XXL_Trailer.avi"));

            File fringe = new File(parentDir, "Fringe S04E05 HDTV XviD-LOL[ettv]");
            FileUtils.touch(new File(fringe, "Thumbs.db"));
            FileUtils.touch(new File(fringe, "Torrent Downloaded From ExtraTorrent.com.txt"));
            FileUtils.touch(new File(fringe, "fringe.405.hdtv-lol.avi"));
            File hp = new File(parentDir, "Helt.Perfekt.S02E04.NORWEGiAN.720p.HDTV.x264-BareHD");
            FileUtils.touch(new File(hp, "Sample"));
            FileUtils.touch(new File(hp, "helt.perfekt.s02e04.720p-barehd.mkv"));
            FileUtils.touch(new File(hp, "helt.perfekt.s02e04.720p-barehd.nfo"));
            File justified = new File(parentDir, "Justified Season 1 Completed 720p");

            FileUtils.touch(new File(justified, "Justified.S01E01.720p.HDTV.x264.mkv"));
            FileUtils.touch(new File(justified, "Justified.S01E02.720p.HDTV.x264.mkv"));
            FileUtils.touch(new File(justified, "Justified.S01E05.720p.HDTV.x264.mkv"));
            FileUtils.touch(new File(justified, "Justified.S01E06.720p.HDTV.x264.mkv"));
            FileUtils.touch(new File(justified, "Justified.S01E07.720p.HDTV.x264.mkv"));
            FileUtils.touch(new File(justified, "Justified.S01E08.720p.HDTV.x264.mkv"));
            FileUtils.touch(new File(justified, "Justified.S01E10.720p.HDTV.x264.mkv"));
            FileUtils.touch(new File(justified, "Justified.S01E11.720p.HDTV.x264.mkv"));
            FileUtils.touch(new File(justified, "Justified.S01E12.720p.HDTV.x264.mkv"));
            File la = new File("LA.Ink.S04E03.WS.DSR.XviD-OMiCRON [NO-RAR] - [ www.torrentday.com ]");
            FileUtils.touch(new File(la, "Thumbs.db"));
            FileUtils.touch(new File(la, "la.ink.s04e03.ws.dsr.xvid-omicron.avi"));
            File madmen = new File(parentDir, "Mad Men Season1 (XviD asd) EnglishV+NapisyPL - www.xvidasd.com");
            FileUtils.touch(new File(madmen, "Mad Men [1x05] 5G (XviD asd).avi"));
            FileUtils.touch(new File(madmen, "Mad Men [1x06] Babylon (XviD asd).avi"));
            FileUtils.touch(new File(madmen, "Mad Men [1x07] Red In The Face (XviD asd).avi"));
            FileUtils.touch(new File(madmen, "Mad Men [1x09] Shoot (XviD asd).avi"));
            FileUtils.touch(new File(madmen, "Mad Men [1x10] Long Weekend (XviD asd).avi"));
            FileUtils.touch(new File(madmen, "Mad Men [1x11] Indian Summer (XviD asd).avi"));
            FileUtils.touch(new File(madmen, "Mad Men [1x12] Nixon vs Kennedy (XviD asd).avi"));
            FileUtils.touch(new File(madmen, "Mad Men [1x13] The Wheel (XviD asd).avi"));
            FileUtils.touch(new File(madmen, "Thumbs.db"));
            File ouat = new File(parentDir, "Once Upon a Time S01E21 The Stranger HDTV XviD-2HD[ettv]");
            FileUtils.touch(new File(ouat, "Once.Upon.a.Time.S01E21.HDTV.XviD-AFG.avi"));
            FileUtils.touch(new File(ouat, "Once.Upon.a.Time.S01E21.HDTV.XviD-AFG.nfo"));
            FileUtils.touch(new File(ouat, "Thumbs.db"));
            FileUtils.touch(new File(ouat, "Torrent Downloaded From ExtraTorrent.com.txt"));
            File sp = new File("South.Park.S16E13.720p.HDTV.x264-IMMERSE [PublicHD]");
            FileUtils.touch(new File(sp, "South.Park.S16E13.720p.HDTV.x264-IMMERSE.mkv"));
            FileUtils.touch(new File(sp, "south.park.s16e13.720p.hdtv.x264-immerse.nfo"));
            File dude = new File(parentDir, "The Dudesons Season 3 Complete[2009]TVRip-ToRRaNt");
            FileUtils.touch(dude);
            File touch = new File(parentDir, "Touch.S01E11.HDTV.XviD-AFG");
            FileUtils.touch(new File(touch, "Touch.S01E11.HDTV.XviD-AFGhumbs.db"));
            FileUtils.touch(new File(touch, "Touch.S01E11.HDTV.XviD-AFGhumbs.db"));
            FileUtils.touch(new File(touch, "Torrent Downloaded From ExtraTorrent.com.txt"));
            FileUtils.touch(new File(touch, "Touch.S01E11.HDTV.XviD-AFG.avi"));
            FileUtils.touch(new File(touch, "Touch.S01E11.HDTV.XviD-AFG.nfo"));
            FileUtils.touch(new File(parentDir, "True Blood S05E05 HDTV x264-ASAP[ettv]"));
            FileUtils.touch(new File(parentDir, "Californication.S05E12.HDTV.RM-ASAP.3gp"));
            FileUtils.touch(new File(parentDir, "Fringe.S04E03.720p.HDTV.X264-DIMENSION.mkv"));
            FileUtils.touch(new File(parentDir, "Last.Resort.S01E04.720p.HDTV.X264-DIMENSION.mkv"));
            FileUtils.touch(new File(parentDir, "South.Park.S16E05.HDTV.x264-2HD.mp4"));
            FileUtils.touch(new File(parentDir, "Terra.Nova.S01E03.720p.HDTV.X264-DIMENSION.mkv"));
            FileUtils.touch(new File(parentDir, "motorjournalen.s15e05.avi"));
            FileUtils.touch(new File(parentDir, "Amistad.1997.DVD-Rip.XviD"));
            FileUtils.touch(new File(parentDir, "Bachelorette 2012 HDRip XViD-sC0rp"));
            FileUtils.touch(new File(parentDir, "Basic.2003.DVDRip.Xvid-Nile"));
            FileUtils.touch(new File(parentDir, "Frankenweenie 2012 BRRiP Xvid SilverHD (SilverTorrent)"));
            FileUtils.touch(new File(parentDir, "Game.Of.Death.2010.DVDRip.Xvid {1337x}-Noir"));
            FileUtils.touch(new File(parentDir, "Ghostbusters [1984] DvDrip H.264 AAC - Westy1983"));
            FileUtils.touch(new File(parentDir, "Lockout.UNRATED.BDRip.XviD-COCAIN"));
            FileUtils.touch(new File(parentDir, "Management.LiMiTED.DVDRip.XviD-DoNE"));
            FileUtils.touch(new File(parentDir, "Meeting Evil[2012]BRRip XviD-ETRG"));
            FileUtils.touch(new File(parentDir, "S.W.A.T. Firefight (2011) 720p BRRip x264 [Dual-Audio] [English-Hindi] TeamTNT ExClusive"));
            FileUtils.touch(new File(parentDir, "SWINGERS [1996][ENG][AC3][DVDRip][KonzillaRG]-Spindoctor720"));
            FileUtils.touch(new File(parentDir, "Safe 2012 1080p BDRip H264 AAC - KiNGDOM"));
            FileUtils.touch(new File(parentDir, "Secretariat.2010.BDRip.XviD-iMBT"));
            FileUtils.touch(new File(parentDir, "Seven.Below.2012.480p.BRRip.XviD.AC3-NYDIC"));
            FileUtils.touch(new File(parentDir, "Shelter.LiMiTED.DVDRip.XviD-ALLiANCE"));
            FileUtils.touch(new File(parentDir, "THE VETERAN [2011] DVD Rip Xvid [StB]"));
            FileUtils.touch(new File(parentDir, "Taken.2.2012.RETAIL.DVDRIP.XVID.AC3.5.1-26K"));

            System.out.println("PAth" + path + " am I ? " + Files.exists(path));
            FileUtils.deleteDirectory(parentDir);

            System.out.println("am I now ? " + Files.exists(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
