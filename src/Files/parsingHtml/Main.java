package Files.parsingHtml;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       String htmlFile = parseFile("Files/parsingHtml/code");

       Document doc =  Jsoup.parse(htmlFile);
     Elements elements =  doc.select("a.menu_link");
     elements.forEach(System.out::println);//получаем список всех элементов меню на сайте
// извлекаем из них содержимое наших эйчтмл тегов
        elements.forEach(element -> {
            System.out.println(element.text());
        });

    }
    public static String parseFile(String path){
        StringBuilder builder = new StringBuilder();
        try {
           List<String> lines =  Files.readAllLines(Paths.get(path));
           lines.forEach(line -> builder.append(line + "\n"));
        } catch (Exception ex) {
           ex.printStackTrace();
        }


        return builder.toString();
    }
}
