package Files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ClassFiles {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
//читать файлы
        try {
            List<String> lines = Files.readAllLines(Paths.get("Files/info.txt"));//сразу читает все строки
           lines.forEach(line -> builder.append(line + "\n"));
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        System.out.println(builder.toString());
    }
}
