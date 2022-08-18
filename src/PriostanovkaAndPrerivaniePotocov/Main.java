package PriostanovkaAndPrerivaniePotocov;

public class Main {
    public static void main(String[] args) {
        // нужно для того чтобы если поток незнает какой объем был у задачи и узнает об этом в процессе мог прервать либо свое выполнение, либо
        // выполнение какого либо другого потока

        Thread thread = new Processor();
        Thread interrupter = new Thread(new Interrupter(thread));

        thread.start();
        interrupter.start();

    }
}
