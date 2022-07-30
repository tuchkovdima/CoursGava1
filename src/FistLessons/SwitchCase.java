package FistLessons;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        while (true) {
            System.out.println("vvod sms");

            String input = new Scanner(System.in).nextLine();
/*
            if (input.equals("Hellow")) {
                System.out.println("Hellow");
            } else if (input.equals("How are you")) {
                System.out.println("good");
            } else {
                System.out.println("whattttttttt");
            }

 */
            switch (input) {
                case "Hellow" -> {
                    System.out.println("Hellow");
                    System.out.println("chmo");
                }
                case "How are you" -> System.out.println("good");
                default -> System.out.println("whatttt");
            }
        }
    }
}
