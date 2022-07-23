package STRING.Preobrazovania;

public class StringNumber {
    public static void main(String[] args) { //преобразование чисел в строки
        int age = 37;
        String name = "Anna";
        String personInfo = name + "-" + age + "лет";

        Double weight = 2.54;
        String value = weight.toString();

        String value1 = String.valueOf(weight);

        //преобразование строки в число
        String value2 = "456859550";
        int count = Integer.parseInt(value2);
        System.out.println(count);


        String value3 = "4.62373748559";
        double weinf = Double.parseDouble(value3);
        System.out.println(weinf);

    }
}
