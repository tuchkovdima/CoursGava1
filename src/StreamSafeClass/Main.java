package StreamSafeClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;
public class Main {
    private static StringBuffer builder  = new StringBuffer();

    public static void main(String[] args) {
      //  Collections.synchronizedCollection(); - оборачивают объект в новый потокобезопасный объект

  ArrayList<Thread> threads = new ArrayList<>();
  for (int i = 0; i < 100; i++){
      threads.add(new Thread(()-> {
          for (int j = 0; j < 10000; j++){
              builder.append("d");
          }
          System.out.println(builder.length()); // размер
      }));
  }
  threads.forEach(Thread::interrupt);
    }
}

//bilder.appenfd() - метод дабавления