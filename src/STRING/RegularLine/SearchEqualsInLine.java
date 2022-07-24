package STRING.RegularLine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchEqualsInLine {
    public static void main(String[] args) {
    // в тексте письма найти все ссылки
        String text = "Алексей, добрый день! \nМой гитхаб - https://girhub.com/, а также ссылка на мой персональный сайт - https://dimas.com ";

        String regex = "https:\\/\\/[^,\\s]+";

        Pattern pattern = Pattern.compile(regex);//принимет регулярное выражение
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            int start = matcher.start();
            int end = matcher.end();
            System.out.println(text.substring(start, end));
        }

    }
}
