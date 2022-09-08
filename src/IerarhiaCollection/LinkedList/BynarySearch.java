package IerarhiaCollection.LinkedList;

import Lambda.Employee;

import java.util.*;

public class BynarySearch {
    public void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(4);
        list1.add(7);
        list1.add(-1);

        int index1 = Collections.binarySearch(list1, 2); // если отрицательное значение, искомый элемент не найден

        Collections.sort(list1);
        int index2  = Collections.binarySearch(list1, 4);
        System.out.println(index2);

        Employee  emp1 = new Employee(100, "zzz", 12345);
        Employee emp2 = new Employee(22, "dddd", 21232);
        Employee  emp3 = new Employee(12, "ff", 12345);
        Employee emp4 = new Employee(33, "yyy", 21232);
        Employee  emp5 = new Employee(44, "nnnn", 12345);
        Employee emp6 = new Employee(2244, "yyysds", 21232);

        List<Employee> list2 = new ArrayList<>();
        list2.add(emp1);
        list2.add(emp2);
        list2.add(emp3);
        list2.add(emp4);
        list2.add(emp5);
        list2.add(emp6);
        System.out.println(list2);

        Collections.sort(list2);
        System.out.println(list2);

        int index3 = Collections.binarySearch(list2, new Employee(33, "yyy", 21232));
        System.out.println(index3);

        int[] array = {-3,8,12,-8};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(array);
        int index4 = Arrays.binarySearch(array, 8);
        System.out.println(index4);

        Collections.sort(list1);
        System.out.println(list1);
        Collections.reverse(list1);
        System.out.println(list1);
        Collections.shuffle(list1); //перемешать
        System.out.println(list1);
    }
    class Employee implements Comparable<Employee>{

        public Employee(int id, String name, int salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return id == employee.id && salary == employee.salary && Objects.equals(name, employee.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, salary);
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    '}';
        }

        int id;
        String name;
        int salary;

        @Override
        public int compareTo(Employee another) {
             int result = this.id - another.id;
             if (result == 0){
               result = this.name.compareTo(another.name);
             }
            return result;
        }
    }
}

