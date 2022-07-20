package WhileAndDoWhile;

import java.util.Scanner;

public class WhileAndDoWhail2 {
    public static void main(String[] args) {
        int sum = 0;
        int value = -1;
        while (value != 0) {
            value = new Scanner(System.in).nextInt();
            sum = sum + value;
        }
        System.out.println(sum + "result");

        for (int i = -1; i != 0;){
            System.out.println(i);
        }
    }
}
