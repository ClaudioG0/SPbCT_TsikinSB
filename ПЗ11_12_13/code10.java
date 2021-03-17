import java.util.Arrays;

public class code10 {
    public code10() {
    }
    public static void main(String[] args) {
        Test test = new Test();
        String[] arr = {"String 1","String 4",
                "String 2","String 3"};
        test.dumpArray(arr);
        Arrays.sort(arr);
        test.dumpArray(arr);
        int ind = Arrays.binarySearch(arr,
                "String 4");
        System.out.println(
                "\nIndex of \"String 4\" = " + ind);
    }

}