import java.io.*;
import java.util.*;

public class DataManager {

    public static void saveData(String filename, List<String> records)
            throws IOException {

        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter(filename))) {

            for (String record : records) {
                writer.write(record);
                writer.newLine();
            }
        }
    }

    public static List<String> loadData(String filename)
            throws IOException {

        List<String> records = new ArrayList<>();

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(filename))) {

            String line;

            while ((line = reader.readLine()) != null) {
                records.add(line);
            }
        }

        return records;
    }

    public static void displayFile(String filename) {

        try {
            List<String> records = loadData(filename);

            System.out.println("\n--- Saved File Records ---");

            for (String record : records) {
                System.out.println(record);
            }

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());

        } finally {
            System.out.println("File operation completed.");
        }
    }
}

