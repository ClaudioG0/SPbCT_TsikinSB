import java.util.Arrays;

public class itog_insertion_sort {
        public static void main(String[] args)
        {
            Integer nums[];
            int i = -1;
            Integer y ;
            int j ;
            nums = new Integer [ 1 ];
            nums = Put(90,nums ,i = in(i)) ; // Пример добовление числа в очередь и динамическое увеличение масcива
            nums = Put(-9,nums ,i = in(i)) ;
            nums = Put(420,nums ,i = in(i)) ;
            nums = Put(11,nums ,i = in(i)) ;
            nums = Put(6,nums ,i = in(i)) ;
            nums = Put(99,nums ,i = in(i)) ;
            nums = Put(1003,nums ,i = in(i)) ;
            nums = Put(200,nums ,i = in(i)) ;

            System.out.print(Arrays.toString(nums));
            System.out.print('\n');
            System.out.println("--------------------— Ввод данных успешен —-------------------------------");
            y = Get(nums) ;
            System.out.println(y);
            y = Get(nums) ;
            System.out.println(y);

            System.out.println("--------------------— Доставление из очереди прошло успешно —--------------------");
            System.out.println(nums.length);
            System.out.println(nums);

            nums = GetAll(nums); // Очищаем пустые ячейки масива
            System.out.println('\n');

            System.out.println(nums.length); // Вывод для проверки
            System.out.println(nums);


            System.out.println("---------------— Очистка масива от пустых полей успешна —----------------");
            int R[] = new int [ nums.length ];

            for ( j = 0; j < nums.length ; j++)
            {

                R[j] = (nums[j]) ; // Преобразование масива из String[] в Int[]
            }
            R = insertionSortImperative(R); // Вызываем метод для сортировки по варианту 0 (Пузырьковая сортировка)

            for ( j = 0; j < R.length ; j++){
                System.out.println(R[j]); // Выводим массив для проверки сортировки
            }
            System.out.println("----------— Работа сортировки успешна (1 индивидуальное задание ) —---------");

        }
        static Integer[] Put (Integer x, Integer[] y, int i)
        {
            if (y.length <= i )
            {

                Integer PLM[] = new Integer [y.length * 2 ];

                for (int j = 0; j < y.length; j++){
                    PLM[j] = y[j];
                }
                y = PLM;
            }

            y[i] = x ;
            return y;
        }
        static int in (int x )
        {
            x++;
            return x ;
        }
        static Integer Get (Integer y[] )
        {
            return y[0] ;
        }

        static Integer[] GetAll (Integer y[] )
        {
            int k = 0 ;
            for (int i = 0 ; i < y.length; i++)
            {
                if (y[i] == null )
                {
                    k++;
                }
            }
            Integer PLM[] = new Integer [ (y.length - k) ];

            for (int j = 0; j < PLM.length; j++){
                PLM[j] = y[j];
            }
            return PLM;
        }
        public static int[] insertionSortImperative(int[]array)
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
    }
