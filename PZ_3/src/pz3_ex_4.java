import java.lang.*;
import java.io.*;


class pz3_ex_4
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число от 0 до 100, чтобы узнать разряд своей оценки: ");
        String s = reader.readLine();
        int number = Integer.parseInt(s);
        if (number >= 0 && number <= 50)
            System.out.println("разряд F");
        else if (number >=51 && number <=60)
            System.out.println("разряд E");
        else if (number >=61 && number <=70)
            System.out.println("разряд D");
        else if (number >=71 && number <=80)
            System.out.println("разряд C");
        else if (number >=81 && number <=90)
            System.out.println("разряд B");
        else if (number >= 91 && number <=100)
            System.out.println("разряд A");
        else{
            System.out.println("error");
        }

    }
}