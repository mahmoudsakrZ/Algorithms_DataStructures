package approximateOfPi;

public class example {


    // pi approx

    public static double approx(double[][] pts) {

        double totalSize = pts.length;
        double count = 0;
        for (int i = 0; i < totalSize; i++) {
            if (Math.pow(pts[i][0], 2) + Math.pow(pts[i][1], 2) <= 1) {
                count += 4;
            }
        }
        return count / totalSize;
    }

    public static void main(String[] args) {
        double[][] pts = new double[10000][2];
        for (int i = 0; i < 10000; i++) {
            pts[i][0] = Math.random();
            pts[i][1] = Math.random();
        }
        System.out.println(approx(pts));

    }




}
