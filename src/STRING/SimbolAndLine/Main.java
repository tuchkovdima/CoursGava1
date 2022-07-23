package STRING.SimbolAndLine;

public class Main {
    public static void main(String[] args) {
        String line = "5456546547";
        char symble = line.charAt(0);//получение первого символа строки
        System.out.println(Character.isDigit(symble)); // проверяет, вляется ли первый параметр цифрой

        //считаем количество пробелов в строке

        String text = "Заметки о приключениях Шерлока холмса";
        int spaceCount = 0;
        for (int i = 0; i < text.length(); i++){ //Текст возвращает длину строки
            char symbol = text.charAt(i);
            if(symbol == ' '){
                spaceCount++;
            }
        }
        System.out.println(spaceCount);

        //удаление пробелов в строках

        String name = "Andriana  ";
        System.out.println(name.trim());



    }
}
