package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Input {
    public static void main(String[] args) {

        try (InputStreamReader isr = new InputStreamReader(System.in)) {
            System.out.print("Enter the letters: ");
            int letters = isr.read();
            while (isr.ready()) {
                System.out.println((char) letters);
                letters = isr.read();
            }
            // isr.close();
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try (FileReader fr = new FileReader("note.txt")) {
            int letters = fr.read();
            while (fr.ready()) {
                System.out.println((char) letters);
                letters = fr.read();
            }
            // fr.close();
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // byte to char stream and then reads char stream.
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("You typed: " + br.readLine());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader("note.txt"))) {
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
