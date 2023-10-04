package exceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class TextDateiSchreiben {
    public static void main(String[] args) {
        String fileName = "Aufgabe.txt";
        try(PrintWriter writer = new PrintWriter(fileName)){
            writer.println(LocalDateTime.now());
        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
        }
    }
}
