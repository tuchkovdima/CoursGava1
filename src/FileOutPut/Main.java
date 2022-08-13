package FileOutPut;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        try {


        PrintWriter writer = new PrintWriter("data/file.txt");
        for (int i = 0; i < 100; i++){
            writer.write(i + "\n");
        }
        writer.flush();// сбрасывает буфер
        writer.close(); // завершеие файла при читке никакая другая программа писать туда не может, пока мы записываем

        } catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
