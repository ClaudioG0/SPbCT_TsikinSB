import java.util.Arrays;
import java.util.*;


public class test3 {

    int size;

    public test3(int size) {
        this.size = size;
    }


    public static void main(String[] args) {
        test3 arrSize = new test3(8);
        int[] array = new int[arrSize.size];

        System.out.println("Задание 1 - вариант 3.");

        System.out.println("Создаем очередь из 8 элементов");
        System.out.println(Arrays.toString(array));
        System.out.println("\n");

        array = Put(array, 56);
        array = Put(array, 65);
        array = Put(array, 3);
        array = Put(array, 14);
        array = Put(array, 55);
        array = Put(array, 22);
        array = Put(array, 22);
        array = Put(array, 128);

        System.out.println("добавили элементы в очередь");
        System.out.println(GetAll(array));
        System.out.println("\n");


        System.out.println("получили элемент из начала очереди");
        System.out.println(array[0]);
        array = Get(array);
        System.out.println(GetAll(array));
        System.out.println("\n");


        System.out.println("Отсортировали очередь по возрастанию методом вставками");
        array = insertionSort(array);
        System.out.println(GetAll(array));
        System.out.println("\n");



        System.out.println("Задание 2 - вариант 2. генерация массива из 30 элементов," +
                            "  и вывод среднего значения");
        int[] C = new int[30];
        int max = 20;
        for (int i = 0 ; i < C.length; i++) {
            int rnd = rnd(max);
            C[i] = rnd;
        }
        System.out.println(Arrays.toString(C));
        int sum = 0;
        for (int i = 0; i < C.length; i++) {
            sum = sum + C[i];
        }
        System.out.println((double) sum/C.length);
    }

    public static int[] Put(int[] x, int y){
        int arrayLength = x.length;
        if (x[x.length-1] != 0){
            x = Arrays.copyOf(x, x.length * 2);
            x[x.length - arrayLength] = y;
        }else {
            for(int i=0; i< x.length; i++){
                if(x[i]==0){
                    x[i] = y;
                    break;
                }
            }
        }
        return x;
    }

    public static int[] Get(int[] array){
        array = Arrays.copyOfRange(array, 1, array.length);
        return array;
    }



    public static String GetAll(int[] array)
    {
        return Arrays.toString(array);
    }

    public static int[] insertionSort(int[]array)
    {
        for (int left = 0; left < array.length; left++) {
            // Вытаскиваем значение элемента
            int value = array[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array[i + 1] = value;
        }
        return array;
    }

    public static int rnd(int max)
    {
        return (int) (Math.random() * ++max);
    }

}
