package Lambda;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.io.StreamCorruptedException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Stream;

import static jdk.internal.org.jline.utils.InfoCmp.Capability.lines;

public class Main {
    private static String staffFile = "data/staff.txt";
    private static String dateFormat = "dd.MM.yyyy";

    public static void main(String[] args) {
        ArrayList<Employee> staff = loadStaffFormFile();
        // отсортировать сотрудников по зарплате
        /**
         *  Collections.sort(staff, new Comparator<Employee>() { // класс, который инплементирует интерфейс компаратор
         *             @Override
         *             public int compare(Employee o1, Employee o2) {
         *                 return o1.getSalary().compareTo(o2.getSalary());//compareTo стравнение с зп второго сотрудника
         *             }
         *         });
         *         for (Employee employee : staff){
         *             System.out.println(employee);
         *         }
         */

        //MAP REDUCE - для распределенныз вычиислениий

        // хотим получить сумму всех затрат свыше 1000000 руб
        staff.stream().map(e -> e.getSalary()).filter(s -> s >= 1000000).reduce((s1, s2) -> s1 + s2).ifPresent(System.out::println);


        //ПООЛУЧЕНИЕ МИНИМАЛЬНОГО И МАКСиМАЛЬНОГО ЗНАЧЕнИЯ и сортировки

        //сортировка по зп сотрудников
        staff.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
        // макчимальное и мминимальное зп
        staff.stream().min(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);// если сотрудник существует, напечатаем
//optional.isPresent(); // существует ли данный объект
        //преобраззовать объект в сотрудника
        //   Employee  employee = optional.get();


        // бесконечные стримыы
        //числа от 0 до бесконечностии
        Stream.iterate(1, n -> n + 1).forEach(System.out::println);

// Стрим состоящий из одинаковых строкк
        Stream.generate(() -> "aaaaa").forEach(System.out::println);


        //(конечные стримы)


        // к примеру мы хотим  отсортироваттьь соттрудников, у которыйх зп больше 10 к рублейй
        Stream<Employee> stream = staff.stream();
        stream.filter(employee -> employee.getSalary() >= 10000).forEach(System.out::println);

// как получить перемменную stream
        staff.parallelStream(); // меттод позволяяющий производить параллельные вычисления

        // stream прямо из множества элементов stream из чисел вызываем статический метод of
        Stream<Integer> number = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        // распечатаем только четнные числа
        number.filter(numbers -> numbers % 2 == 0).forEach(System.out::println);

        // Streaam можно получить из массива
        Integer[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Arrays.stream(num).forEach(System.out::println);

        // при помощи лямбда выражений
        //  Collections.sort(staff, (o1, o2) -> o1.getSalary().compareTo(o2.getSalary()));
        staff.forEach(employee -> System.out.println(employee)); // применяем каждому оббъекту лямбда выражение
        //либо
        staff.forEach(System.out::println);

        //увеличим зарплату нашим сотрудникам
        System.out.println("old series");
        staff.forEach(System.out::println);

        int ten = 10000;
        staff.forEach(e -> e.setSalary(e.getSalary() + ten));

        // то жее самое
        staff.forEach(employee -> {
            int salery = employee.getSalary();
            employee.setSalary(salery + 10000);
        });

        System.out.println("new series");
        staff.forEach(System.out::println);


    }

    private static ArrayList<Employee> loadStaffFormFile() {
        ArrayList<Employee> staff = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(staffFile)); // readAllLines возвращал коллекцию со строками
            for (String line : lines) {
                String[] fragments = line.split("\t");
                if (fragments.length != 3) { // если 3 элемента , то строка правильная
                    System.out.println("Wrong line" + line);
                    continue;
                }
                staff.add(new Employee( // добавляли нового сотрудника
                        fragments[0],
                        Integer.parseInt(fragments[1]),
                        (Data) (new SimpleDateFormat(dateFormat)).parse(fragments[2])
                ));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return staff;
    }
}
