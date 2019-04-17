package JavaConcepts.Comparable;

import java.util.ArrayList;
import java.util.List;

public class Attribute implements Comparable<Attribute> {


    public static void main(String[] args) {

    }

    private String name;
    private List<String> spiesList = new ArrayList<>();
    private List<String> suspectList = new ArrayList<>();


    public Attribute(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Attribute attribute) {
        if (this.spiesList.size() > attribute.spiesList.size())
            return -1;
        else if (this.spiesList.size() < attribute.spiesList.size())
            return 1;
        else
            return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSpiesList() {
        return spiesList;
    }

    public void setSpiesList(List<String> spiesList) {
        this.spiesList = spiesList;
    }

    public List<String> getSuspectList() {
        return suspectList;
    }

    public void setSuspectList(List<String> suspectList) {
        this.suspectList = suspectList;
    }

    @Override
    public String toString() {
        return "JavaConcepts.Comparable.Attribute{" +
                "name='" + name + '\'' +
                ", spiesList=" + spiesList +
                ", suspectList=" + suspectList +
                ", spiestListSize=" + spiesList.size() +
                ", suspectListSize=" + suspectList.size() +
                '}';
    }
}



