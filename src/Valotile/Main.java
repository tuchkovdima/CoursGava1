package Valotile;

import java.util.Scanner;

//volatile - пишется перед переменными и означает, что эта переменная может изменяться из разных потоков
// и операционная система должна следить за этой переменной, каждый раз, когда она меняется
public class Main {
    public static void main(String[] args) {
        Task task = new Task();
        new Thread(task).start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        task.stop();
        System.out.println("Main: " + task.getCounterValue()); // что в нем в итоге получилось
    }
}
