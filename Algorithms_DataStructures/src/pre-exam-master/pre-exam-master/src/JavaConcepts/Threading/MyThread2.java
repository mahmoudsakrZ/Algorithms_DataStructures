package JavaConcepts.Threading;

public class MyThread2 implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10 ; i++) {
                Thread.sleep(1000);
                System.out.println("Thread 2 is running");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
