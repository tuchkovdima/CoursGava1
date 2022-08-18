package PoolsStreamExecutorrsExecutorAndExecutorService;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        //чтобы работало аптимальное для приложения колличество потоков

//        Executor executor = Executors.newSingleThreadExecutor();//создает экзекютор состоящий из одного потока
//        executor.execute(()-> {
//            for (;;){
//                System.out.println(Math.random());
//            }
//        });// подавать задачи, которые имплементируют интерфейс runnable
//

//не завершаются, если только специально их не завершить
        ExecutorService service = Executors.newSingleThreadExecutor();//создает экзекютор состоящий из одного потока
        Future<Double> future = service.submit(()->{ // submit будет возвращать объект интерфейса future
            double sum = 0;
            for (int i =0; i < 10000; i++){
                sum += Math.random();
            }
            return sum;
                });
        try {
            System.out.println(future.get());
service.shutdown(); //завершение потоков
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
