// https://www.codingame.com/ide/puzzle/ascii-art


package problemSolving.ASCIIArt;

import java.util.*;
import java.io.*;
import java.math.*;

public class Solution {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int H = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String T = in.nextLine();
        T = T.toUpperCase();
        String res = "";
        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();
            for (int j = 0; j < T.length(); j++) {
                int index = (T.charAt(j) - 'A');
                int s = 0;
                if (index > 25)
                    s = 26 * L;
                else
                    s = index * L;
                int e = s + L;
                res += ROW.substring(s, e);
            }
            res += "\n";
        }
        System.out.println(res);
    }
}
