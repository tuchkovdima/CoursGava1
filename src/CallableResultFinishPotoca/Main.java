package CallableResultFinishPotoca;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) {
        //Интерфейс Callable
        Callable callable = () -> { //можно генерировать эксептион
            double sum = 0;
            for (int i = 0; i < 1000; i++) {
                sum += Math.random();
            }
            if (sum < 0.1) {
                throw new IllegalArgumentException("ffff");
            }
            return sum / 1000;
        };
        FutureTask<Double> futureTask = new FutureTask<>(callable);//запускаем
        new Thread(futureTask).start();

        try {
            System.out.println(futureTask.get());// печатаем результат
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println("Ex" + e.getMessage());
        }
    }
}
