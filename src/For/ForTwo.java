package For;

import java.util.Scanner;

public class ForTwo {
    public static void main(String[] args) {
        //числа в обратном порядке
        for (int i = 50; i > 0; i = i - 1) {
            System.out.println(i);
        }
        for (int z = 0; z <= 100; z = z + 2) { // только четные числа
            System.out.println(z);
        }
        //умножение одного числа на другое

        for (; ; ) { //Бесконечный цикл
            System.out.println("vvedite number");

            int value1 = new Scanner(System.in).nextInt(); // ввод числв
            System.out.println(value1 + " first number");
            int value2 = new Scanner(System.in).nextInt();
            System.out.println(value2 + " Second number");
            int result = value1 * value2;
            System.out.println(result);
            break;
        }
        int v = 0;
        for (; v < 100; v = v + 3) {
            System.out.println(v);
        }
        for (int a = 0; ; a = a + 5){
            System.out.println(a);
        }
    }
}
