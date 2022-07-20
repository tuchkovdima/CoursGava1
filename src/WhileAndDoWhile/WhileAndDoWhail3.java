package WhileAndDoWhile;

import java.util.Scanner;

public class WhileAndDoWhail3 {
    public static void main(String[] args) {
        int secretPincode = 7567;
        int pincode = -1;

        while (pincode != secretPincode) {
            if (pincode == -1) {
                System.out.println("vvod pin: ");
            } else {
                System.out.println("not");
            }
            pincode = new Scanner(System.in).nextInt();
        }
        System.out.println("YES");
    }
}
