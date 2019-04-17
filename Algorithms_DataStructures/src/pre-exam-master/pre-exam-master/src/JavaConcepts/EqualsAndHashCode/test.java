package JavaConcepts.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class test {


    public static void main(String[] args) {

        Student alex1 = new Student(1, "Alex");
        Student alex2 = new Student(1, "Alex");
        System.out.println("alex1 hashcode = " + alex1.hashCode());
        System.out.println("alex2 hashcode = " + alex2.hashCode());
        System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));


        System.out.println("=============================================");

        // with Array List
        // works fine with override equals method only


        Student alex = new Student(1, "Alex");
        List<Student> studentsLst = new ArrayList<Student>();
        studentsLst.add(alex);
        System.out.println("Arraylist size = " + studentsLst.size());
        System.out.println("Arraylist contains Alex = " + studentsLst.contains(new Student(1, "Alex")));

        System.out.println("=============================================");

        // with hashSet
        // if we removed hashcode method from Student will not work fine
        // and will save two object of alex3 and alex4 cause have different hashcode

        Student alex3 = new Student(1, "Alex");
        Student alex4 = new Student(1, "Alex");
        HashSet < Student > students = new HashSet< Student >();
        students.add(alex3);
        students.add(alex4);
        System.out.println("HashSet size = " + students.size());
        System.out.println("HashSet contains Alex = " + students.contains(new Student(1, "Alex")));


        // the same operation also for  HashMap, HashTable

    }

}
