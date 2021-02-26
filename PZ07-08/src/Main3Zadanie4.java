
public class Main3Zadanie4 {
    public static void main(String[] args) {
        Type2[] types = Type2.values();
        for (Type2 s : types) { System.out.println(s); }
    }
}
enum Type2
{
    SCIENCE,
    BELLETRE,
    PHANTASY,
    SCIENCE_FICTION
}