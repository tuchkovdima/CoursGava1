package IerarhiaCollection.LinkedList;

import java.util.LinkedList;
import java.util.Objects;

public class LinkedListEx1 {
    public static void main(String[] args) {
        Students2 st1 = new Students2("Ivan", 3);
        Students2 st2 = new Students2("xxx", 2);
        Students2 st3 = new Students2("jon", 3);
        Students2 st4 = new Students2("Alex", 1);

        LinkedList<Students2> stu1 = new LinkedList<>();

        stu1.add(st1);
        stu1.add(st2);
        stu1.add(st3);
        stu1.add(st4);

        System.out.println("LinkedList  = " + stu1);
        System.out.println(stu1.get(2));

        Students2 st5 = new Students2("zz", 4);
        Students2 st6 = new Students2("tt", 5);
        Students2 st7 = new Students2("dima", 2);

        stu1.add(st5);
        stu1.add(st6);
        System.out.println(stu1);

        stu1.add(1, st7);
        System.out.println(stu1);

        stu1.remove(3);
        System.out.println(stu1);



        /*
        Элементы LinkedList - это звенья одной цепочки. Эти элементы хранят определенные данные, а так же
        ссылки на предыдущий и следующий элемент
         */
    }
}
class Students2{
    String name;
    int course;

    public Students2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students2 students2 = (Students2) o;
        return course == students2.course && Objects.equals(name, students2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    @Override
    public String toString() {
        return "Students2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }




}
