package JavaConcepts.Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class main {

    public static void main(String[] args) {

        Attribute a1 = new Attribute("RED HAIR");


        a1.getSpiesList().add("A");
        a1.getSpiesList().add("A");
        a1.getSpiesList().add("A");
        a1.getSpiesList().add("A");



        a1.getSuspectList().add("AA");


        Attribute a2 = new Attribute("BLUE HAIR");

        a2.getSpiesList().add("B");

        a2.getSuspectList().add("BB");
        a2.getSuspectList().add("BB");
        a2.getSuspectList().add("BB");


        ArrayList<Attribute> attrList = new ArrayList();
        attrList.add(a1);
        attrList.add(a2);

        System.out.println("----------------------------\n SORT BY SPIES LIST \n----------------------------");

        //sort by spies list
        Collections.sort(attrList, new sortByspiesListSize());


        for (Attribute a : attrList) {
            System.out.println(a.getName() + " spies List size :" + a.getSpiesList().size() + " suspect List size :" + a.getSuspectList().size());
        }


        System.out.println("----------------------------\n SORT BY SUSPECT LIST \n----------------------------");

        //sort by suspect list
        Collections.sort(attrList, new sortBysuspectListSize());

        for (Attribute a : attrList) {
            System.out.println(a.getName() + " spies List size :" + a.getSpiesList().size() + " suspect List size :" + a.getSuspectList().size());

        }

    }

}
