package Pattern.Decorator;

import java.io.BufferedInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.zip.GZIPInputStream;

public class Main {
    public static void main(String[] args) {
        //Структурный паттерн
        //используется для изменения функциональности объекта в процессе выполнения не затрагивая при этом другие объекты этого же класса
        // и не меняя их поведение

        // к примеры различные виды файловых потоков FileInputStream fis = new FileInputStream ("somefile.gz");

      //  BufferedInputStream bis = new BufferedInputStream(fis);
      //  GZIPInputStream gis = new GZIPInputStream(bis); //разорхивания
      // ObjectInputStream = new ObjectInputStream(gis);
      //SomeObject someObject = (SomeObject) ois.readObject();
        // каждый класс, оборачивает предыдущий добавляя дополнительную функциональность
        //ois.close(); - закрываем все стримы
    }
}
