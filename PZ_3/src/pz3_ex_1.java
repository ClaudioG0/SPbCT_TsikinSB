import java.util.Scanner;

public class pz3_ex_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        if (num<100){
            System.out.println("less");
        }else{
            System.out.println("not less");
        }
        in.close();
    }
}