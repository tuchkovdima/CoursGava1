package pe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Metods
{
    private static final List<String> list = new ArrayList<>(); //пожно работать из любой точки программы

    public void text()
    {

        System.out.println("1 - List");
        System.out.println("2 - Add");
        System.out.println("3 - Edit");
        System.out.println("4 - Delete");

        list.add("xyilo");
        list.add("Inga");
        list.add("Cigan");


        System.out.println("Your List " + list);


        while (true){


        Scanner scanner = new Scanner(System.in);
        System.out.println("vvedite command");




        int input = scanner.nextInt();

            if (input == 1) {
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i) + "=" + i);
                }
            }

            if (input == 2) {
                System.out.println("Dobaviti mesto v spiske");
                int a = scanner.nextInt();

                if (a > list.size()){
                    System.out.println("xer te in your face");
                    break;
                }

                System.out.println("Elemet give: ");
                String b = scanner.next();

                for (int i = 0; i < list.size(); i++) {
                    list.add(a, b);
                    break;
                }
                System.out.println(list);
            }

            if (input == 3) {
                System.out.println("vvedite index for replace");

                int inputFree = scanner.nextInt();

                System.out.println("number index");

                String item = scanner.next();

                for (int i = 0; i < list.size(); i++) {
                    list.set(inputFree, item); //заменить
                    break;
                }
                System.out.println(list);

            }

            if (input == 4) {
                System.out.println("number symbol, which you want delite");

                String item = scanner.next();

                for (int i = 0; i < list.size(); i++) {
                    list.remove(item);
                    break;
                }
                System.out.println(list);
            }
           else if (input != 1 && input != 2 && input != 3 && input != 4)
                 {
                    System.out.println("Teacher  go, na xyi");
                 }
        }
    }
}
