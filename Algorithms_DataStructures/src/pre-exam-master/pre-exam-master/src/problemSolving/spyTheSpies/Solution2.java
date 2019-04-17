package spyTheSpies;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Result: 60%
public class Solution2 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String enemy1 = in.next();
        String enemy2 = in.next();
        String enemy3 = in.next();
        String enemy4 = in.next();
        String enemy5 = in.next();
        String enemy6 = in.next();
        String[] enemies = {enemy1, enemy2, enemy3, enemy4, enemy5, enemy6};
        if (in.hasNextLine()) {
            in.nextLine();
        }
        List<String> allKeywords = new ArrayList<>();

        boolean[] enemiesFlags = new boolean[15];
        List<String> queries = new ArrayList();

        for (int i = 0; i < 15; i++) {
            String suspect = in.nextLine();
            queries.add(suspect);
            String[] parts = suspect.split(" ");
            enemiesFlags[i] = false;
            for (int j = 0; j < 6; ++j) {
                if (parts[0].equals(enemies[j])) {
                    enemiesFlags[i] = true;
                    break;
                }
            }
            for (int k = 2; k < parts.length; ++k) {
                allKeywords.add(parts[k]);
            }
        }
        String innocentKeyword = "", enemyKeyword = "";
        for (int i = 0; i < allKeywords.size(); ++i) {
            if (enemyKeyword == "")
                for (int j = 0; j < 15; ++j) {
                    if (!queries.get(j).contains(allKeywords.get(i)) && enemiesFlags[j] == true) {
                        enemyKeyword = "";
                        break;
                    } else if (queries.get(j).contains(allKeywords.get(i)) && enemiesFlags[j] == true) {
                        enemyKeyword = allKeywords.get(i);
                    }
                }
            if (innocentKeyword == "")
                for (int j = 0; j < 15; ++j) {
                    if (!queries.get(j).contains(allKeywords.get(i)) && enemiesFlags[j] == false) {
                        innocentKeyword = "";
                        break;
                    } else if (queries.get(j).contains(allKeywords.get(i)) && enemiesFlags[j] == false) {
                        innocentKeyword = allKeywords.get(i);
                    }
                }
        }
        if (enemyKeyword != "") System.out.println(enemyKeyword);
        if (innocentKeyword != "") System.out.println("NOT " + innocentKeyword);
    }
}
