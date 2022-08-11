package ConsoleCustomerList.src;

import java.io.IOException;
import java.util.Scanner;

public class Main
{
    private static String addCommand = "add Василий Петров " +
            "vasily.petrov@gmail.com +79215637722";
    private static String commandExamples = "\t" + addCommand + "\n" +
            "\tlist\n\tcount\n\tremove Василий Петров";
    private static String commandError = "Wrong command! Available command examples: \n" +
            commandExamples;
    private static String helpText = "Command examples:\n" + commandExamples;

    public static void main(String[] args)
    {
        //имеется массив строк
        String[]name = {"Дмитрий","sergei", " Anna"};
        try {
            // пытаемся получить доступ к 5 элементу массива
            System.out.println(name[5]);

        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage()); // не прервалось выполнение нашей команды, напечатали ошибку
            System.out.println("Вы запросили не существующий элемент массива");
        }

        Scanner scanner = new Scanner(System.in);
        CustomerStorage executor = new CustomerStorage();
        for(;;) {
            try {


                String command = scanner.nextLine();
                String[] tokens = command.split("\\s+", 2);
                if (tokens[0].equals("add")) {
                    if (!executor.addCustomer(tokens[1])) {
                        System.out.println("error adding customer: wrong formft" + "Correct format: \n" + addCommand);
                    }
                    executor.addCustomer(tokens[1]);
                } else if (tokens[0].equals("list")) {
                    executor.listCustomers();
                } else if (tokens[0].equals("remove")) {
                    executor.removeCustomer(tokens[1]);
                } else if (tokens[0].equals("count")) {
                    System.out.println("There are " + executor.getCount() + " customers");
                } else if (tokens[0].equals("help")) {
                    System.out.println(helpText);
                } else {
                    System.out.println(commandError);
                }
            } catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            } catch (IOException e) {
                throw new RuntimeException(e);//непроверяемые эксептион
            }
        }
    }
}
