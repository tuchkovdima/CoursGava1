package IncrementAndDicrement;

public class Main {
    public static void main(String[] args) {
        char c = 'b';
        c++;
        System.out.println(c);

        int value = Integer.MAX_VALUE;
        System.out.println(value++); //2147483647

        int set = Integer.MAX_VALUE;
        System.out.println(++set); //-2147483648


        int x=50;
        int number = x++ + ++x;
        // Х++ = 51,  значение равно 50
        // ++x = 52,  значение равно 52
    }
}
