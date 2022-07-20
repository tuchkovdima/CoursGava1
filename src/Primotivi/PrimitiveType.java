package Primotivi;

public class PrimitiveType {
    public static void main(String[] args) {
        int count = 247_384;
        long big = 3235000000L;
        float value = 30.0f;

        String newLine = System.lineSeparator(); //перенос на следующую строку
        System.out.println("First line" + newLine + "Second line");

        //перевод всех чисел типа char

        for (int i = 0; i < 65536; i++) {
            char c = (char) i; //перевод символа в число
            System.out.println(i + "-" + c);
        }
    }
}
