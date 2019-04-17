package spyTheSpies;


import javafx.print.Collation;

import java.util.*;


class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String enemy1 = in.next();
        String enemy2 = in.next();
        String enemy3 = in.next();
        String enemy4 = in.next();
        String enemy5 = in.next();
        String enemy6 = in.next();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String[] enemies = new String[]{enemy1, enemy2, enemy3, enemy4, enemy5, enemy6};
        HashMap<String, Attribute> attributeHashMap = new HashMap<>();
        for (int i = 0; i < 15; i++) {
            String suspect = in.nextLine();
            String[] tokens = suspect.split(" ");
            for (int x = 2; x < tokens.length; x++) {
                if (attributeHashMap.get(tokens[x]) == null) {
                    attributeHashMap.put(tokens[x], new Attribute(tokens[x]));
                }

                Attribute attribute = attributeHashMap.get(tokens[x]);
                for (int j = 0; j < enemies.length; j++) {
                    if (tokens[0].equals(enemies[j])) {
                        attribute.getSpiesList().add(tokens[0]);
                    } else {
                        attribute.getSuspectList().add(tokens[0]);
                    }
                }
            }
        }

        ArrayList<Attribute> attributeList = new ArrayList(attributeHashMap.values());
        Collections.sort(attributeList, new sortByspiesListSize() );

        for(Attribute attribute : attributeList){
            if(attribute.getSuspectList().size() == 9 && attribute.getSpiesList().size() ==0){
                System.out.println("NOT " + attribute.getName() );
            }else if(attribute.getSpiesList().size() == 6 && attribute.getSuspectList().size() == 0  ){
                System.out.println(attribute.getName());
            }else {
                System.out.println("B");
            }
        }


        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

    }


    static class Attribute {

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
            return "Comparable.Attribute{" +
                    "name='" + name + '\'' +
                    ", spiesList=" + spiesList +
                    ", suspectList=" + suspectList +
                    ", spiestListSize=" + spiesList.size() +
                    ", suspectListSize=" + suspectList.size() +
                    '}';
        }
    }

    static class sortByspiesListSize implements Comparator<Attribute> {
        @Override
        public int compare(Attribute a1, Attribute a2) {
            return a1.getSuspectList().size() - a2.getSuspectList().size();
        }
    }

    static class sortBysuspectListSize implements Comparator<Attribute> {
        @Override
        public int compare(Attribute a1, Attribute a2) {
            return a1.getSpiesList().size() - a2.getSpiesList().size();
        }
    }


}
