public class main
{
    public static void main(String[] args)
    {
        String nums[];
        int i = -1;
        String y ;
        int j ;
        nums = new String [ 1 ];
        nums = Put("1",nums); // Пример добовление числа в очередь и динамическое увеличение масcива
        nums = Put("4",nums);
        nums = Put("8",nums);
        nums = Put("4",nums);
        nums = Put("11",nums);
        nums = Put("6",nums);
// System.out.println(i); // Вывод для проверки
        nums = Put("6",nums);
// System.out.println(i); // Вывод для проверки
        nums = Put("856",nums);
// System.out.println(i); // Вывод для проверки
        nums = Put("55",nums);
        System.out.println("--------------------— Ввод данных успешен —-------------------------------");
        y = Get(nums) ; nums = Gets(nums) ; // Пример доставания числа из очереди
        System.out.println(y); // Вывод для проверки
        y = Get(nums) ; nums = Gets(nums) ;
        System.out.println(y); // Вывод для проверки
        y = Get(nums) ; nums = Gets(nums) ;
        System.out.println(y); // Вывод для проверки
        System.out.println("--------------------— Доставление из очереди прошло успешно —--------------------");
        System.out.println(nums.length); // Вывод для проверки
        nums = AllGets(nums); // Очищаем пустые ечейки масива

        System.out.println(nums.length); // Вывод для проверки

        System.out.println("---------------— Очистка масива от пустых полей успешна —----------------");
        int R[] = new int [ nums.length ];

        for ( j = 0; j < nums.length ; j++)
        {

            R[j] = Integer.parseInt (nums[j]) ; // Преобразование масива из String[] в Int[]
        }
        R = insertionSortImperative(R); // Вызываем метод для сортировки по варианту 0 (Пузырьковая сортировка)

        for ( j = 0; j < R.length ; j++){
            System.out.println(R[j]); // Выводим массив для проверки сортировки
        }
        System.out.println("----------— Работа сортировки успешна (1 индивидуальное задание ) —---------");
        String c[] = new String [ 2 ];
        int max = 0 , min = 40 ;
        double a ;
        String m ;


    }
    static String[] Put ( String x,String y[])
    {
        if (y.length <= 1)
        {

            String PLM[] = new String [y.length * 2 ];

            for (int j = 0; j < y.length; j++){
                PLM[j] = y[j];
            }
            y = PLM;
        }

        y[1] = x ;
        return y ;
    }
    static int in (int x )
    {
        x++ ;
        return x ;
    }
    static String Get (String y[] )
    {
        return y[0] ;
    }
    static String[] Gets (String y[] )
    {
        for (int j = 1; j < y.length ; j++)
        {
            y[j - 1] = y[j];
        }
        y[y.length - 1] = null ;
        return y ;
    }
    static String[] AllGets (String y[] )
    {
        int k = 0 ;
        for (int i = 0 ; i < y.length; i++)
        {
            if (y[i] == null )
            {
                k++;
            }
        }
        String PLM[] = new String [ (y.length - k) ];

        for (int j = 0; j < PLM.length; j++){
            PLM[j] = y[j];
        }
        return PLM;
    }
    public static int[] insertionSortImperative(int[]input)
    {
        int a;
        for (int i = 0; i < input.length; i++)
        {
            for (int j = i + 1; j < input.length; j++)
            {
                if(input[i] > input[j])
                {
                    a=input[i];
                    input[i]=input[j];
                    input[j]=a;
                }
            }
        }
        return input;
    }
}