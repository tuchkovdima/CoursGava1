package SynhronizeMetod;

import java.util.ArrayList;

public class SynhronizeMetod {

    private static ArrayList<Double> numbers = new ArrayList<>();

    public static void main(String[] args) {

        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            threads.add(new Thread(SynhronizeMetod::someHeavyMethod)); //ссылка на статический метод
        }
        threads.forEach(t -> t.start());
    }
    //заполняет arrayList числами
    //private static synchronized void someHeavyMethod(){ //данный метод в одном потоке
    private static  void someHeavyMethod(){
        for (int i = 0; i < 10000; i++){
            //синхронизируем только 1 строчку кода
            synchronized(numbers){ //все операции будут безопасными // можно в место numbers написать Main.class и синхронизация идет по всем экземплярам класса
                numbers.add(Math.random() / Math.random());
            }

        }
        System.out.println(numbers.size());// печатает размер
        numbers.clear(); // очищает коллекцию
    }
}
