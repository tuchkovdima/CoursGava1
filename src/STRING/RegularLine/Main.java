package STRING.RegularLine;

public class Main {
    public static void main(String[] args) {
        //Проверка соответствия строки определенному шаблону
        String number = "A677MP197";
        String lettersList = "[ABEKMHOPCTУX]";

        //на стороне сервера проверить корректность введенного значения
        String regex = lettersList + "[0-9]{3}" + lettersList + "{2}[0-9]{2,3}"; //[] - первый символ может быть любой из этих букв
        System.out.println(number.matches(regex));//проверка строки в соответствии выражению
    }
}
