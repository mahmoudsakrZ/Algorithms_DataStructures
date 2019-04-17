package JavaConcepts.ObjectOutputStream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Persisit {
    public static void main(String args[]) throws Exception {
        Student s1 = new Student(211, "ravi");
        writeObject(s1);

        Student s2 = (Student) readObject();
        System.out.println(s2);


    }



    public static void writeObject(Object object) throws Exception  {
        if (object instanceof Serializable) {

            FileOutputStream fout = new FileOutputStream("f.txt" , true);
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(object);
            out.flush();
            System.out.println("success");

        }else {
            System.out.println("not serialized");
        }

    }


    public static Object readObject() throws Exception {
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));

        Object s= in.readObject();

        in.close();
        return s;
    }

    public static List<Object> readObjects() throws Exception {
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
        List<Object> objects = new ArrayList<>();
        boolean cont = true;
        while(cont) {
            Object obj = null;
            try {
                obj = in.readObject();
                System.out.println(((Student)obj).toString());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            if (obj != null)
                objects.add(obj);
            else
                cont = false;
        }

        in.close();
        return objects;
    }



    static class Student implements Serializable {
        int id;
        String name;
        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }


        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

}


