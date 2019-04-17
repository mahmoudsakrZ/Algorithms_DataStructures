package JavaConcepts.Comparator;

import java.util.Comparator;

public class sortBysuspectListSize implements Comparator<Attribute> {

    @Override
    public int compare(Attribute a1, Attribute a2) {
        return a1.getSpiesList().size() - a2.getSpiesList().size();
    }
}
