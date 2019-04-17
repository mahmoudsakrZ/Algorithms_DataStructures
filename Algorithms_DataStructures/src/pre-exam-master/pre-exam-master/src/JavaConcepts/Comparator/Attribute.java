package JavaConcepts.Comparator;

import java.util.ArrayList;
import java.util.List;

public class Attribute {

    private String name;
    private List<String> spiesList = new ArrayList<>();
    private List<String> suspectList = new ArrayList<>();


    public Attribute(String name) {
        this.name = name;
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



