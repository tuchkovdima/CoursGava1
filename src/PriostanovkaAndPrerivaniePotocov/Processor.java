package PriostanovkaAndPrerivaniePotocov;

public class Processor extends Thread{
    @Override
    public void run(){
        double sum = 0;
        for (;;){
            if (isInterrupted()){
                System.out.println(sum);
                break;
            }
            sum += Math.random();
        }
    }
}
