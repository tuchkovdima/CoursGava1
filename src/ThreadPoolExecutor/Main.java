package ThreadPoolExecutor;
//расширяемый пулл потоков со множественными параметрами спомощью которого можно регулировать пулл потоков

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        executor.getQueue().size(); // размер очереди потоков, которые ждут своего выполнения

        //setCorePoolSize();
        //то колличество потоков которые содержатся по умолчанию в этом потоке

        // setKeepAliveTime(); сколько дополнительные потоки, могут находится в состоянии бездействия
    }
}
