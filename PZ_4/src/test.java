//public class test {
//    public static void main(String[] args) {
//        String nums[];
//        int i = -1;
//        String y;
//        int j;
//        nums = new String[1];
//        nums = Put("1", nums, i = in(i)); // Пример добовление числа в очередь и динамическое увеличение масcива
//        nums = Put("4", nums, i = in(i));
//        nums = Put("8", nums, i = in(i));
//        nums = Put("4", nums, i = in(i));
//        nums = Put("11", nums, i = in(i));
//        nums = Put("6", nums, i = in(i));
//// System.out.println(i); // Вывод для проверки
//        nums = Put("6", nums, i = in(i));
//// System.out.println(i); // Вывод для проверки
//        nums = Put("856", nums, i = in(i));
//// System.out.println(i); // Вывод для проверки
//        nums = Put("55", nums, i = in(i));
//        System.out.println("Ввод данных");
//        y = Get(nums);
//        nums = Gets(nums); // Пример доставания числа из очереди
//        System.out.println(y); // Вывод для проверки
//        y = Get(nums);
//        nums = Gets(nums);
//        System.out.println(y); // Вывод для проверки
//        y = Get(nums);
//        nums = Gets(nums);
//        System.out.println(y); // Вывод для проверки
//        System.out.println("Доставление из очереди");
//        System.out.println(nums.length); // Вывод для проверки
//        nums = AllGets(nums); // Очищаем пустые ечейки масива
//
//        System.out.println(nums.length); // Вывод для проверки
//
//        System.out.println("Очистка массива от пустых полей");
//        int R[] = new int[nums.length];
//
//        for (j = 0; j < nums.length; j++) {
//
//            R[j] = Integer.parseInt(nums[j]); // Преобразование масива из String[] в Int[]
//        }
//        R = insertionSortImperative(R); // Вызываем метод для сортировки по варианту 0 (Пузырьковая сортировка)
//
//        for (j = 0; j < R.length; j++) {
//            System.out.println(R[j]); // Выводим массив для проверки сортировки
//        }
//    }
//
//    static String[] Put(String x, String y[], int i) {
//        if (y.length <= i) {
//
//            String PLM[] = new String[y.length * 2];
//
//            for (int j = 0; j < y.length; j++) {
//                PLM[j] = y[j];
//            }
//            y = PLM;
//        }
//
//        y[i] = x;
//        return y;
//    }
//
//    static int in(int x) {
//        x++;
//        return x;
//    }
//
//    static String Get(String y[]) {
//        return y[0];
//    }
//
//    static String[] Gets(String y[]) {
//        for (int j = 1; j < y.length; j++) {
//            y[j - 1] = y[j];
//        }
//        y[y.length - 1] = null;
//        return y;
//    }
//
//    static String[] AllGets(String y[]) {
//        int k = 0;
//        for (int i = 0; i < y.length; i++) {
//            if (y[i] == null) {
//                k++;
//            }
//        }
//        String PLM[] = new String[(y.length - k)];
//
//        for (int j = 0; j < PLM.length; j++) {
//            PLM[j] = y[j];
//        }
//        return PLM;
//    }
//
//
//}