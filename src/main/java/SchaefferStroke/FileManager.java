package SchaefferStroke;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class FileManager {

    public static void writeAggregation(Map<Integer, Integer> aggregation, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Map.Entry<Integer, Integer> entry : aggregation.entrySet()) {
                writer.write(entry.getKey() + " - " + entry.getValue());
                writer.newLine();
            }
            System.out.println("Агрегация записана в: " + filename);
        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
        }
    }

    public static void writeLogicalOperations(String[] results, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (String result : results) {
                writer.write(result);
                writer.newLine();
            }
            System.out.println("Логические операции записаны в: " + filename);
        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
        }
    }
}