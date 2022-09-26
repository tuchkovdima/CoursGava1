package IerarhiaCollection.TreeMap;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Double, Student> map1 = new TreeMap<>();
        TreeMap<Student, Double> map2 = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        });
        Student st1 = new Student(1, "d", "f");
        Student st2 = new Student(2, "s", "f");

        Student st3 = new Student(3, "f", "f");
        Student st4 = new Student(4, "v", "f");
        Student st5 = new Student(5, "a", "f");
        Student st6 = new Student(2, "c", "f");

        Student st7 = new Student(5, "df", "f");
        Student st8 = new Student(5, "g", "f");

        /*
        Ключи уникальные

         */
        map1.put(5.8, st1);
        map1.put(5.4, st2);
        map1.put(5.6, st3);
        map1.put(5.5, st4);
        map1.put(5.3, st5);

        System.out.println(map1);
        System.out.println(map1.get(5.3));
        System.out.println(map1.remove(5.4));
        /*
        desendingMap - разворачиваем наш TreeMap в другую сторону
         */
        System.out.println(map1.descendingMap());

        /*
        основа использования Treemap это нахождение ренджей, то есть отрезков
         */

        /*
        найти студентов у которых балл выше чем 5.2
         */
        System.out.println(map1.tailMap(5.2)); //от 5.2 хвост
        /*
        балл мыше
         */
        System.out.println(map1.headMap(5.6)); //голова

        /*
        lastEntry  выводим элемент, который находится в самом конце
         */
        System.out.println(map1.lastEntry());
        System.out.println(map1.firstEntry());// элемент в начале коллекции
    }
}

public class Student implements Comparable<Student>{

    int course;
    String name;
    String surename;
    public Student(int course, String name, String surename) {
        this.course = course;
        this.name = name;
        this.surename = surename;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surename, student.surename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(course, name, surename);
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                ", name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
