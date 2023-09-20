package Exceptions;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class NotenLesen {
    public static final String gueltigeNoten = "C, D, E, F, G, A, B, C D E F G A B c d e f g a b c' d' e' f' g' a' b'";
    public static void readAndWriteNotes() {
        String fileName = "src\\main\\java\\Exceptions\\ABC.txt";
        String[] noten = gueltigeNoten.split(" ");
        Arrays.sort(noten);
        try (Scanner scanner = new Scanner(Paths.get(fileName));
                PrintWriter writer = new PrintWriter("Noten.txt")) {
            writer.println("M:C");
            writer.println("L:1/4");
            writer.println("K:C");

            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(line.isEmpty())
                    continue;
                if(Arrays.binarySearch(noten, line) >= 0)
                    writer.printf("%s ", line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        readAndWriteNotes();
    }
}
