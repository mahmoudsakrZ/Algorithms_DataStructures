package problemSolving.approximateOfPi;

public class example2 {

    public static void main(String[] args) {

        double count = 1000000;
        double success = 0;
        double x, y;
        for (int i = 0; i < count; i++) {
            x = Math.random();
            y = Math.random();
            success += x*x + y*y <= 1 ? 1 : 0;
        }
        double probability = success / count;
        double PI = probability * 4;
        System.out.println("Total: " + (int)count + "\nSuccess: " + (int)success);
        System.out.println("PI = " + PI);

    }
}
