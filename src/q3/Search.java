package q3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Search {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage java for file Search.");
            return;
        }

        String wordToSearch = args[0];

        for (int i = 1; i < args.length; i++) {
            String fileName = args[i];

            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String line;
                int lineNumber = 1;

                while ((line = reader.readLine()) != null) {
                    if (line.contains(wordToSearch)) {
                        System.out.println(fileName + ": " + line);
                    }
                    lineNumber++;
                }

            } catch (IOException e) {
                System.out.println("Error reading file " + fileName + ": " + e.getMessage());
            }
        }
    }
}