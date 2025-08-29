package SchaefferStroke;

public class Operations {

    public static String andOperation(int a, int b) {
        String binaryA = toBinary16bit(a);
        String binaryB = toBinary16bit(b);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 16; i++) {
            char bitA = binaryA.charAt(i);
            char bitB = binaryB.charAt(i);
            result.append((bitA == '1' && bitB == '1') ? '1' : '0');
        }

        return a + " AND " + b + " = " + result.toString();
    }

    public static String orOperation(int a, int b) {
        String binaryA = toBinary16bit(a);
        String binaryB = toBinary16bit(b);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 16; i++) {
            char bitA = binaryA.charAt(i);
            char bitB = binaryB.charAt(i);
            result.append((bitA == '1' || bitB == '1') ? '1' : '0');
        }

        return a + " OR " + b + " = " + result.toString();
    }

    public static String nandOperation(int a, int b) {
        String binaryA = toBinary16bit(a);
        String binaryB = toBinary16bit(b);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 16; i++) {
            char bitA = binaryA.charAt(i);
            char bitB = binaryB.charAt(i);
            result.append(!(bitA == '1' && bitB == '1') ? '1' : '0');
        }

        return a + " NAND " + b + " = " + result.toString();
    }

    private static String toBinary16bit(int number) {
        String binary = Integer.toBinaryString(number);
        while (binary.length() < 16) {
            binary = "0" + binary;
        }
        return binary;
    }
}
