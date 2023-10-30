import java.util.Random;

public class Task2 {

    public static void sel() {

        Random random = new Random(); //створюємо об'єкт класа рандом для генерації випадкових чисел

        int len = 10;

        double[] array = new double[len];

        for (int i = 0; i < len; i++) {
            double minValue = 0;
            double maxValue = 100.0;
            array[i] = minValue + (maxValue - minValue) * random.nextDouble();
        }

        System.out.println("a");
        for (int i = 0; i < len; i++) {
            System.out.println(array[i]);
        }

        for (int i = 1; i < len; i++) {
            double key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] < key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }


        System.out.println("a");
        for (int i = 0; i < len; i++) {
            System.out.println(array[i]);
        }


    }


    static void printResults() {
        try {
            sel();
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION!" + e.getMessage());
        }
    }


    public static void main(String[] args) {

        printResults();

    }


}
