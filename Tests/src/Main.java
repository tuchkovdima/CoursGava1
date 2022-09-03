import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list3  = new ArrayList<>(200);
        int count =0;
        for (int i = 0; i < 20; i++) {
            list3.add("a");
            count++;

        }
        System.out.println(count +"=" + list3);
    }
}
