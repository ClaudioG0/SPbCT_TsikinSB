import java.util.StringTokenizer;

public class code11 {

    public code11() {
    }
    public static void main(String[] args) {
        Test test = new Test();
        String toParse =
                "word1;word2;word3;word4";
        StringTokenizer st =
                new StringTokenizer(toParse,";");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}