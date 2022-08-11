package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadOnFiles {
    public static void main(String[] args) throws IOException {
        FileInputStream is = new FileInputStream("File/info.txt");
        //       is.read();// читает очередной символ и возвращает код этого символа

        StringBuilder builder = new StringBuilder();

        for (;;){
            int code = is.read();
            if (code < 0){
                break;
            }
            char ch = (char) code;
            System.out.println(ch);
            builder.append(ch);

        }
    }
}
