package JavaConcepts.Threading;

public class MyThread extends Thread {
    String name;

    MyThread(String name){
        this.name = name;
    }

    public void run(){
        try {
            for (int i = 0; i < 10 ; i++) {
                Thread.sleep(500);
                System.out.println("Thread "+ name +" is running");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
