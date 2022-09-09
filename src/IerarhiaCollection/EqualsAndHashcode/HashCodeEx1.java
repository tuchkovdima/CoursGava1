package IerarhiaCollection.EqualsAndHashcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {

        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Dima", "Di", 3);
        Student st2 = new Student("Saha", "wwwww", 2);
        Student st3 = new Student("ggggg", "bbbbbb", 4);

        map.put(st1, 7.5);
        map.put(st2, 8.5);
        map.put(st3, 5.5);

        System.out.println(map);

        Student st4 = new Student("Dima","Di", 3);
        Student st5 = new Student("Youn", "xelooo", 6);


        boolean result = map.containsKey(st4);
        System.out.println("result = " + result);

        System.out.println(st1.hashCode());

        for (Map.Entry<Student, Double> entry: map.entrySet()) {
            System.out.println(entry.getKey()+ ":" +  entry.getValue());
        }
        Map<Integer, String> map2 = new HashMap<>(16, 0.75f);

    }
}
class Student{

    String name;
    String surname;
    int course;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    //не качественный hashcode (коллизия)
//    @Override
//    public int hashCode() {
//        return name.length() + surname.length() + course;
//    }

//        @Override
//    public int hashCode() {
//            return name.length()*7 + surname.length()*11 + course*53;
//    }



    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }




}
