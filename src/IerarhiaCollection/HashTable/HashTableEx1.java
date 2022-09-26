package IerarhiaCollection.HashTable;

import IerarhiaCollection.EqualsAndHashcode.Student;

import java.util.Hashtable;

public class HashTableEx1 {
    public static void main(String[] args) {
        Hashtable<Double, Student> ht = new Hashtable<>();

        Student st1 = new Student("Dima", "d", 4);
        Student st2 = new Student("dss", "d", 3);
        Student st3 = new Student("Difsa", "s", 44);

        ht.put(7.8, st1);

        System.out.println(ht);

    }
}
