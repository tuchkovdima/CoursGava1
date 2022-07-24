package STRING.RegularLine;

public class Zamena {
    public static void main(String[] args) {
        //приводит номер телефона в определенном формате к стандартному виду

        String phone1 = "+7 903 710-37-54";
        String phone2 = "7 (903) 668-69-45";
        String phone3 = "7999-666-66-66";
        String phone4 = "7(903)9686945";

        //79039995555
        System.out.println(formatPhoneNumber(phone1));
        System.out.println(formatPhoneNumber(phone2));
        System.out.println(formatPhoneNumber(phone3));
        System.out.println(formatPhoneNumber(phone4));
    }
    public static String formatPhoneNumber(String phone){
        String regex = "[^0-9]";
       return phone.replaceAll(regex, ""); //замена на пустую строку всех знаков кроме 0-9
    }
}

// регулярные выражения
// [abc] - набор символов
// [^abc] - отрицание
// \s - пробельный символ
// n+ - один или несколько символов
// n* - ноль или несколько символов
// n? - ноль или 1 символ
// n{5} - 5 раз
// n{5,} - 5 и более раз
// n{5,8} - от 5 до 8 раз