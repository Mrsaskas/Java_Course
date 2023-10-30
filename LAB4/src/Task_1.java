import java.util.Random;


public class Task_1 {


    public static void arr() {

        Random random = new Random(); //створюємо об'єкт класа рандом для генерації випадкових чисел

        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(201) - 100;
        }

        int sum = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
            if (array[i] < 0) {
                sum += array[i];
            }
        }

        System.out.println("sum = " + sum);


    }


    static void printResults() {
        try {
            arr();
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION!" + e.getMessage());
        }
    }


    public static void main(String[] args) {

        printResults();

    }


}
