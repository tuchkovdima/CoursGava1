import java.util.*;

public class Main {
    public static void main(String[] args) {

    Point point1  = new Point(0,0);
    Point point2  = new Point(0,4);

    ArrayList<Point> list1 = new ArrayList<>();
    list1.add(point1);
    list1.add(point2);

    int  result = 0;

        for (int i = 0; i < list1.size(); i++) {

           result = (int) Math.sqrt((Math.pow((point2.getX()-point1.getX()),2) ) + (Math.pow((point2.getY()-point1.getY()),2)));


        }
        System.out.println(result);
    }
}
//       ArrayList<Student> list1 = new ArrayList<>();
//        Queue<Student> queue1 = new ArrayDeque<>();
//
//
//        Student st1 = new Student("dima", 2);
//        Student st2 = new Student("Semchik", 3);
//        Student st3 = new Student("Asman", 0);
//        Student st4 = new Student("Kiri", -1);
//
//        list1.add(st1);
//        list1.add(st2);
//        list1.add(st3);
//        list1.add(st4);
//
//        queue1.add(st1);
//        queue1.add(st2);
//        queue1.add(st3);
//        queue1.add(st4);
//
//        System.out.println(queue1);
//        System.out.println(list1);
//
//        for (int i = 0; i < list1.size(); i++) {
//            if (list1.get(i).getName()  ==  "Asman"){
//                System.out.println(list1.get(i));
//            }
//
//            }
//        }
//
//}
//
//class Student{
//    String name;
//    int course;
//
//    public Student(String name, int course) {
//        this.name = name;
//        this.course = course;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getCourse() {
//        return course;
//    }
//
//    public void setCourse(int course) {
//        this.course = course;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return course == student.course && Objects.equals(name, student.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, course);
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", course=" + course +
//                '}';
//    }
//}