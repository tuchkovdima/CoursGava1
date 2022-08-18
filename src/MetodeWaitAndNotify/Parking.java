package MetodeWaitAndNotify;

public class Parking {
    private int parkingSize = 500;
    private int carCount = 0;

    public synchronized void in() throws InterruptedException {
        if (carCount == parkingSize){
            wait();
        }
       // wait(); //освобождает монитор и переводит поток в состояние ожидания до тех пор пока другой поток не вызовет метод нотифай у того же объекта
      //  notify(); // продолжает работу потока, у которого был ранее вызван метод wait
      //  notifyAll();// возобнавляет работу всех потоков у которых был ранее вызван метод wait

        carCount++;
        System.out.println("Zavezen");
        System.out.println("Open mesta: " + (parkingSize - carCount));
        notify();
    }

    public synchronized void out() throws InterruptedException {
        if (carCount == 0){
            wait();
        }
        carCount--;
        System.out.println("vivezen");
        System.out.println("Open mesta: " + (parkingSize - carCount));

        notify();
    }
}
