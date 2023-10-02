public class Task2 {

    public static double xf(double t, int i){

        double x = 0;
        double sum = 0;

        if(i == 1 || i == 2 )
        {
            x = Math.log(t);
        }
        else if (i>2)
        {

            for(int k = 1;k<i;k++)
            {
                sum = sum + (Math.sin(t)/k);
            }

            x = sum;


        }

        return x;


    }

    static void printResults(double t, int i) {
        try {
            System.out.println("function = " + xf(t,i));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION!" + e.getMessage());
        }
    }


    public static void main(String[] args){

       printResults(2,2);

    }


}
