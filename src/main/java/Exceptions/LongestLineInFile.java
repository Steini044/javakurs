package Exceptions;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LongestLineInFile {
    public static void main(String[] args) {
        String filename = "src\\main\\java\\Exceptions\\Hinson.txt";
        try {
            List<String> lines = Files.readAllLines(Paths.get(filename));
            String longestName = lines.get(0);
            String secondLongestName = lines.get(0);
            for (String line : lines) {
                if (line.length() > longestName.length()) {
                    secondLongestName = longestName;
                    longestName = line;
                } else if (line.length() > secondLongestName.length()){
                    secondLongestName = line;
                }
            }
            System.out.println("longest name: " + longestName + ", second longest name: " + secondLongestName);
        } catch (IOException e) {
            System.err.println("There was an Input Output Exception!");
        }

        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(new File("")));
            clip.start();
            TimeUnit.MICROSECONDS.sleep(clip.getMicrosecondLength() + 50);
            clip.close();
        }
        catch (UnsupportedAudioFileException | LineUnavailableException | IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
