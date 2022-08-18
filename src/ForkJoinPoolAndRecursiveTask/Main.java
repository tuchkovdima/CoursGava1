package ForkJoinPoolAndRecursiveTask;

import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        //ForkJoinPool и RecursiveTask отъветвление и объединение потоков

        // посчитать сумму значений во всем дереве

        Node root = null;

       Long sum =  new ForkJoinPool().invoke(new NodeValueSumCalculator(root)); // создаем задачу от корневого узла
        // invoke вернет общую сумму по всему дереву
        System.out.println(sum);
    }
}
