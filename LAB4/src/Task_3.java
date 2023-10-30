import java.util.Random;

public class Task_3 {

    public static void arr() {

        Random random = new Random(); //створюємо об'єкт класа рандом для генерації випадкових чисел

        int[] arrayA = new int[10];
        int[] arrayB = new int[10];
        int[] arrayC = new int[20];

        for (int i = 0; i < 10; i++) {
            arrayA[i] = random.nextInt(100);
            arrayB[i] = random.nextInt(100);
        }


        System.out.println("arrayA");
        for (int i = 0; i < 10; i++) {
            System.out.println(arrayA[i]);
        }

        System.out.println("arrayB");
        for (int i = 0; i < 10; i++) {
            System.out.println(arrayB[i]);
        }

        int p = 0;

        for(int j = 0;j < 20;j++)
        {
            if(j<10)
            {
                arrayC[j] = arrayA[j];
            }
            else
            {
                arrayC[j] = arrayB[p];
                p++;
            }
        }


        System.out.println("arrayC");
        for (int i = 0; i < 20; i++) {
            System.out.println(arrayC[i]);
        }
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
