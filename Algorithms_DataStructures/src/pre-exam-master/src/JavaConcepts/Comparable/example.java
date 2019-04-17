package JavaConcepts.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class example {

    public static void main(String[] args) {


        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Allla" , 24));
        students.add(new Student(1,"ahmed" , 50));
        students.add(new Student(1,"ali" , 20));
        students.add(new Student(1,"bb" , 10));
        students.add(new Student(1,"cc" , 5));

        Collections.sort(students);

        for(Student s : students){
            System.out.println(s.name + " --> " + s.age);
        }
    }

}


class Student implements Comparable<Student> {
    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student st) {
        if (age == st.age)
            return 0;
        else if (age > st.age)
            return 1;
        else
            return -1;
    }
}