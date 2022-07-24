package STRING.RegularLine;

public class PartLineOnTheFragmtnt {
    public static void main(String[] args) {
        // разбить текст на слова
        String text = "I  know something about it";
        String[] words = text.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        System.out.println(words[0]);
    }
}
