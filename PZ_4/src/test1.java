//public class test1
//{
//    public static void main(String[] args)
//    {
//
//        String c[] = new String [ 2 ];
//        int max = 0 , min = 40 ;
//        double a ;
//        String m ;
//        for (int j = 0; j < 10 ; j++) // Цикл с данными из задания
//        {
//            a = Math.random()*40;
//            m = (int)a + "";
//            if ( a > max ){ // Запоминаем максимальное
//                max = j ;
//            }
//            if ( a < min ){ // Запоминаем минимальное
//                min = j ;
//            }
//
//            c = test.Put(m,c,j) ; // Помешаем случайные числа в маси
//        }
//
//        String s ;
//        s = c[max] ;
//        c[max] = c[min] ; // Меняем местами минимальное и максимальное
//        c[min] = s ;
//
//        System.out.println("----------— Вывод финального масива —---------");
//        for (int j = 0; j < 10 ; j++){
//            System.out.println(c[j]);
//        }
//
//    }
//
//}