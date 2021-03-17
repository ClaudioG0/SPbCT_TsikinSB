public class code5 extends java.util.Observable {
    private String name = "";
    public code5(String name) {
        this.name = name;
    }

    public void modify() {
        setChanged();
    }

    public String getName() {
        return name;
    }
}

