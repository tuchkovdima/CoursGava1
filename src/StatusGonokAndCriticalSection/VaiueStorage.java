package StatusGonokAndCriticalSection;

import java.util.concurrent.atomic.AtomicInteger;

public class VaiueStorage {
    //private static int value;
    private static AtomicInteger value = new AtomicInteger(); // для счетчиков многопоточных приложений
    public static void incrementValue(){
       // value = value + 1; // критическая секция - это та часть , которая при выполнении несколькмми потоками, может работать не однозначно
        value.incrementAndGet(); // увеличивает на 1
    }
    public static int getValue(){
        return value.intValue(); // получить значение
    }
}

// атомарные операции - те операции, которые могут совмещать в 1 операцию