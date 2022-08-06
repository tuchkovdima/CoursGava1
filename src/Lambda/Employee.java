package Lambda;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;

public class Employee {


    private String name;
    private Integer salary;
    private Data workStart;

    public Employee(String name, Integer salary, Data workStart) {
        this.name = name;
        this.salary = salary;
        this.workStart = workStart;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Data getWorkStart() {
        return workStart;
    }

    public void setWorkStart(Data workStart) {
        this.workStart = workStart;
    }
    public String toString(){
        return name + "-" + salary + "-" + (new SimpleDateFormat("dd.MM.yyyy")).format(workStart);
    }




}
