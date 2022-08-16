import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Metods
{
    private static final List<String> list = new ArrayList<>(); //пожно работать из любой точки программы

    public void workWCase ()
    {

    }
    public void text()
    {
        System.out.println("1 - List");
        System.out.println("2 - Add");
        System.out.println("3 - Edit");
        System.out.println("4 - Delete");

        list.add("хуйло");
        list.add("Пидорас");
        list.add("Гандон");


        System.out.println("исходный список" + list);

        Scanner scanner = new Scanner(System.in);



            if (scanner.nextInt() == 1) {
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list + "=" + i);
                }
            }

            if (scanner.nextInt() == 2) {
                System.out.println("Dobaviti mesto v spiske");
                int a = scanner.nextInt();

                System.out.println("Elemet give: ");
                String b = scanner.next();

                for (int i = 0; i < list.size(); i++) {
                    list.add(a, b);
                }
                System.out.println(list);
            }

            if (scanner.nextInt() == 3) {
                System.out.println("Добавить на место индекса");
                System.out.println("Введите элемент");
                for (int i = 0; i < list.size(); i++) {
                    list.set(scanner.nextInt(), scanner.next()); //заменить
                }
                System.out.println(list);

            }

            if (scanner.nextInt() == 4) {
                list.remove(scanner.next());
            }
           else
                 {
                    System.out.println("Препод иди нахуй");

                 }
             }
        }
