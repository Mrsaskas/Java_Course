public class Task1 {


    public static double sum(double s){

        double su = 0;



        for(int i = 1;i < 35;i++)
        {
            su = su + Math.log10(Math.sqrt(s*(1/i*i)));

        }

        return su;

    }

    static void printResults(double s) {
        try {
            System.out.println("sum = " + sum(s));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION!" + e.getMessage());
        }
    }


    public static void main(String[] args){

        printResults(35);

    }

}
