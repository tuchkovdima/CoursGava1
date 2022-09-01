package IerarhiaCollection.List.ArrayList;

import java.util.ArrayList;
import java.util.Objects;

public class MetodArrayList2 {
    public static void main(String[] args) {
Students st1 = new Students("Ivan", 'm', 22,3,8.3);
        Students st2 = new Students("Nicola", 'm', 22,3,8.3);
        Students st3 = new Students("Elena", 'f', 22,3,8.3);
        Students st4 = new Students("Petr", 'm', 22,3,8.3);
        Students st5 = new Students("Dana", 'f', 22,3,8.3);

        ArrayList<Students> studentsList = new ArrayList<>();
        studentsList.add(st1);
        studentsList.add(st2);
        studentsList.add(st3);
        studentsList.add(st4);
        studentsList.add(st5);

        System.out.println(studentsList);
        Students st6 = new Students("Dana", 'f', 22,3,8.3);
        studentsList.remove(st6);
        System.out.println(st6);

        int index = studentsList.indexOf(st6); // в индекс лист ищем на какой позиции находится данный объект
        System.out.println(index);

        ;
    }
}
class Students{
    public Students(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return sex == students.sex && age == students.age && course == students.course && Double.compare(students.avgGrade, avgGrade) == 0 && Objects.equals(name, students.name);
    }
}
