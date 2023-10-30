public class Task1 {

    public static String intToBinaryString(int in) {

        // Перетворення в двійкову систему та збереження у рядку
        String binaryString = Integer.toBinaryString(in);

        return binaryString;

    }

    static void printResults(int in) {
        try {
            System.out.println("binary string = " + intToBinaryString(in));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION!" + e.getMessage());
        }
    }


    public static void main(String[] args) {

        printResults(21);

    }


}
