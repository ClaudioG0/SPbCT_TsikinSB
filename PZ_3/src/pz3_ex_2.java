import java.util.Scanner;

public class pz3_ex_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите оценку: ");
        int num = in.nextInt();
        switch (num){
            case 2:
                System.out.print("неудовлетворительно");
                break;
            case 3:
                System.out.print("удовлетворительно");
                break;
            case 4:
                System.out.print("хорошо");
                break;
            case 5:
                System.out.print("отлично");
                break;
            default:
                System.out.print("такой оценки нет");
        }
        in.close();
    }
}