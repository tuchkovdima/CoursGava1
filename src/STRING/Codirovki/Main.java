package STRING.Codirovki;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {

        // проверка кодироаки на пк
        String charset = Charset.defaultCharset().displayName();
        System.out.println(charset);

        //меняем кодировку строки
        String text1 = "Something about ";
        String encodeText = new String(text1.getBytes(), StandardCharsets.US_ASCII);
        System.out.println(encodeText);
    }
}
