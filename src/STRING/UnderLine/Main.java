package STRING.UnderLine;

public class Main {
    public static void main(String[] args) {

        //Метод вычлинения кодировок
        String header1 = "Content-Type: text/hyml; charset=utf-8";
        String header2 = "Content-Type: text/hyml; charset=windows-1251";
        String header3 = "Content-Type: text/hyml; charset=ISO-8859-1";

        String header4 = "Content-Type: text/hyml;";
        String header5 = "Content-Type: text/hyml; charset=";
        String header6 = "Content-Type: text/hyml; charset=;";

        System.out.println(getEncoding(header1));
        System.out.println(getEncoding(header2));
        System.out.println(getEncoding(header3));

        System.out.println(getEncoding1(header4));
        System.out.println(getEncoding1(header5));
        System.out.println(getEncoding1(header6));
    }
    // методы позиции подстроки
    public static String getEncoding(String header){
        String charsetStr = "charset=";
        int start = header.indexOf(charsetStr) + charsetStr.length(); //indexOf позиция в подстроке
        int end = header.indexOf(';',start); // ищем ; которая после start
        String encoding = header.substring(start, end); //принимает символ, до которого нужно извлечь подстроку не включая это символ
        return encoding;
    }

    public static String getEncoding1(String header){
        String charsetStr = "charset=";
        int start = header.indexOf(charsetStr); //indexOf позиция в подстроке
        int end = header.indexOf(';',start); // ищем ; которая после start

        if (start<0 || end<0){
            return "";
        }

        String encoding = header.substring(start + charsetStr.length(), end); //принимает символ, до которого нужно извлечь подстроку не включая это символ
        return encoding;
    }
    // .indexOf(" .txt") - позволяет найти подстроку в строке ее позицию, если не найдено возвращает -1
    // .indexOf(" .txt", from) - позволяет искать подстроку после определенного символа
    // .lastIndexOf(" .zip") - ищут не сначала, а с конца строки
    // .lastIndexOf(" .zip",from);
    // .substring(from); - получить подстроку от начала до конца строки
    // .substring(from, to); - получить строку в диапазоне
}
