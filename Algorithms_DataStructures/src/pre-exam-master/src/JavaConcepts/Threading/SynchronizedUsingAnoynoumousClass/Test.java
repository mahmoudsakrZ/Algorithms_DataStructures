package JavaConcepts.Threading.SynchronizedUsingAnoynoumousClass;

public class Test {


    public static void main(String[] args) {

        Test t = new Test();

        Thread thread1 = new Thread(){
            @Override
            public void run() {
                super.run();
                t.print(5);
            }
        };

        Thread thread2 = new Thread(){
            @Override
            public void run() {
                super.run();
                t.print(5);
            }
        };

        thread1.start();
        thread2.start();

    }


    void print(int n){

        synchronized(this) {
            for (int i = 0; i < n; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}



