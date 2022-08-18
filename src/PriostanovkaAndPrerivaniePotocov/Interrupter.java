package PriostanovkaAndPrerivaniePotocov;
// поток который будет прерывать поток processor через какое то время

public class Interrupter implements Runnable {

    private Thread thread;

    Interrupter(Thread thread){
        this.thread = thread;
    }
  

    @Override
    public void run(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
            thread.interrupt();
    }
}
