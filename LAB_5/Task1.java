
import java.util.Random;

public class Task1 {

    //Selection sort



    public static double[] gen(int len)
    {
        Random random = new Random(); //створюємо об'єкт класа рандом для генерації випадкових чисел

        //len = 10;

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


        return array;

    }



    public static void sel(int len) {


        double[] array = gen(len);



        for (int i = 0; i < len; i++) {
            int max = i;

            for (int j = i + 1; j < len; j++) {
                if (array[j] > array[max]) {
                    max = j;
                }
            }

            double temp = array[i];
            array[i] = array[max];
            array[max] = temp;

        }


        System.out.println("a");
        for (int i = 0; i < len; i++) {
            System.out.println(array[i]);
        }


    }


    static void printResults() {
        try {
            sel(10);
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION!" + e.getMessage());
        }
    }


    public static void main(String[] args) {

        printResults();

    }


}
