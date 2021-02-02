
public class pz3_ex_51 {
    public static double func(double x){
        double y = 0;
        double a = 7.2;
        double b = 5.7;

        if (x<=1){
            y = 1/(Math.pow(a, 2)+Math.pow(x, 2));
        }
        else if (x>1){
            y = b * Math.log(x);
        }
        return y;
    }

    public static void main(String[] args) {
        double result1 = func(2.92);
        System.out.printf("Ответ при x=2.92: %f \n", result1);

        double result2 = func(-3.57);
        System.out.printf("Ответ при x=-3.57: %f \n", result2);
    }


}