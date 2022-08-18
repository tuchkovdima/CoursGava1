package ScheduledExecutorService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(5);// можно ставить задачи через какое то время
        service.schedule(()-> System.out.println("Yes"), 1000, TimeUnit.MICROSECONDS); // напечатает через 1000 милисекунд

        service.scheduleAtFixedRate(()-> System.out.println("nn"), 1000, 2000, TimeUnit.MILLISECONDS);//периуд через который будет печатать
        //от начала запуска задачи

       // service.scheduleWithFixedDelay() запускается эта же задача в след раз от конца задачи
    }
}
