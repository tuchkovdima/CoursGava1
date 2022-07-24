package STRING.StringPool;

public class Main {
    public static void main(String[] args) {
        String name1 = "Alex";
        String name2 = new String("Alex").intern();
        System.out.println(name1==name2);

    }
}
