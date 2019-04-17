package closestToZero;

import java.math.*;

class Solution {
    static double closestToZero(double[] ts) {
        double closest = 5527.0;
        if (ts.length == 0) {
            return 0;
        } else {
            for (int x = 0; x < ts.length; x++) {
                if (Math.abs(ts[x]) < Math.abs(closest)) {
                    closest = ts[x];
                } else if (Math.abs(ts[x]) == Math.abs(closest)) {
                    closest = Math.max(ts[x], closest);
                }
            }
            return closest;
        }
    }
}