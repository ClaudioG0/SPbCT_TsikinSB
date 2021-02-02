public class pz3_ex_52 {
    public static double func(double x){
        double y = 0;
        double a = 2.73;
        double b = 1.68;

        if (x<=1){
            y = Math.sin(Math.log(Math.abs(x)));
        }
        else if (x>1 && x<=3){
            y = Math.pow(4*x+b, 2);
        }
        else if (x>3){
            y = 1/(Math.pow(x, 2)+Math.pow(a, 2));
        }
        return y;
    }

    public static void main(String[] args) {
        double result1 = func(-0.37);
        System.out.printf("Ответ при x=-0.37: %f \n", result1);

        double result2 = func(1.9);
        System.out.printf("Ответ при x=1.9: %f \n", result2);

        double result3 = func(4.58);
        System.out.printf("Ответ при x=4.58: %f \n", result3);
    }


}