package SchaefferStroke;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        int count = 100000;
        int min = 1;
        int max = 1000;


        int[] numbers = Generator.generateNumbers(count, min, max);


        Map<Integer, Integer> aggregation = Generator.aggregate(numbers);
        FileManager.writeAggregation(aggregation, "aggregation.txt");


        int half = count / 2;
        int[] firstHalf = new int[half];
        int[] secondHalf = new int[half];

        System.arraycopy(numbers, 0, firstHalf, 0, half);
        System.arraycopy(numbers, half, secondHalf, 0, half);


        String[] andResults = new String[half];
        String[] orResults = new String[half];
        String[] nandResults = new String[half];

        for (int i = 0; i < half; i++) {
            andResults[i] = Operations.andOperation(firstHalf[i], secondHalf[i]);
            orResults[i] = Operations.orOperation(firstHalf[i], secondHalf[i]);
            nandResults[i] = Operations.nandOperation(firstHalf[i], secondHalf[i]);
        }


        FileManager.writeLogicalOperations(andResults, "and_operations.txt");
        FileManager.writeLogicalOperations(orResults, "or_operations.txt");
        FileManager.writeLogicalOperations(nandResults, "nand_operations.txt");

        System.out.println("Программа завершена успешно");
        System.out.println("Созданы файлы:");
        System.out.println("1. aggregation.txt - Агрегация данных");
        System.out.println("2. and_operations.txt - Логическое И");
        System.out.println("3. or_operations.txt - Логическое ИЛИ");
        System.out.println("4. nand_operations.txt - Штрих Шеффера");
    }
}