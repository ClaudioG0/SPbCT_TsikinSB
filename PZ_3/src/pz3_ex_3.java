import java.lang.*;
import java.io.*;


class pz3_ex_3
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите день недели: ");
        String s = reader.readLine();

        switch (s) {
            case "понедельник":
                System.out.println("1");
                break;
            case "вторник":
                System.out.println("2");
                break;
            case "среда":
                System.out.println("3");
                break;
            case "четверг":
                System.out.println("4");
                break;
            case "пятница":
                System.out.println("5");
                break;
            case "суббота":
                System.out.println("6");
                break;
            case "воскресенье":
                System.out.println("0");
                break;

            default:
                System.out.println("ошибка, день недели введен неправильно!");

        }

    }
}