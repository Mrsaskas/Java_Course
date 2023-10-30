
import java.util.Random;

public class Task_2 {


    public static void arr() {

        Random random = new Random(); //створюємо об'єкт класа рандом для генерації випадкових чисел

        int[] array = new int[100];

        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(100);
        }


        int el = 0;



        for (int i = 0; i < 100; i++) {
            System.out.println(array[i]);

            if(array[i]%2==0 && i%7==0)
            {
                if(el<array[i])
                {
                    el = array[i];
//                    System.out.println("el = " + el);
//                    System.out.println("i = " + i);
                }
            }

        }

        System.out.println("el = " + el);



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
