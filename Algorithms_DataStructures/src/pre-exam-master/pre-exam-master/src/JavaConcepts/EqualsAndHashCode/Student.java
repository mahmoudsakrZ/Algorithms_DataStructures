package JavaConcepts.EqualsAndHashCode;

/*
*
* Article
*
* https://dzone.com/articles/working-with-hashcode-and-equals-in-java
*
* */

import java.util.Objects;

public class Student {
    private int id;
    private String name;
    public Student(int id, String name) {
        this.name = name;
        this.id = id;
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


 /*
 *  Equals : works fine with equlas method and ArrayList.contains
 *
 *  if we want use HashSet it will output the two object not equals so we should override HashCode Method
 *
 *  HashSet Save Object as buckets and its addresses are hashcode so we should override hashcode for comparing
 *
 * */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Student))
            return false;
        if (obj == this)
            return true;
        return this.getId() == ((Student) obj).getId();
    }


    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}