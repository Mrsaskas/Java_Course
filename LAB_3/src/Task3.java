public class Task3 {

    public static double sum(double ea){

        double su = 0;
        int i = 1;

        while (true) {

            double term = 1/(i*i);
            if(Math.abs(term) < Math.abs(ea)) {
                break; // Перервати цикл, якщо досягнута задана точність
            }
            su += term;
            i++;
        }
        return su;



        }

    static void printResults(double ea) {
        try {
            System.out.println("sum = " + sum(ea));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION!" + e.getMessage());
        }
    }


    public static void main(String[] args){

        printResults(0.1);

    }



}
