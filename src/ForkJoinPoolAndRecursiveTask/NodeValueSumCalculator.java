package ForkJoinPoolAndRecursiveTask;
// класс рекурсивной задачи

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class NodeValueSumCalculator extends RecursiveTask<Long> {

    private Node node;
    public NodeValueSumCalculator(Node node){
        this.node = node;
    }
    @Override
    protected Long compute(){

        long sum = node.getValue();
        List<NodeValueSumCalculator> taskList = new ArrayList<>();
        for (Node child : node.getChildren()){
            NodeValueSumCalculator task = new NodeValueSumCalculator(child);
            task.fork(); // запускаем задачу ассинхронно относительно текущей задачи
            taskList.add(task); // добавляем ее в список задач
        }
        for (NodeValueSumCalculator task : taskList){
            sum += task.join();// дожидается выполнения задачи и возвращает их обратно добавление
        }
        // пока все задачи тут не выполнены, метод будет ждать выполнения
        return sum;
    }

}
