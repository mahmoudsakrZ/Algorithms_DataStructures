package JavaConcepts.Threading;
public class test {
    public static void main(String[] args) {


        /* start with threading

            to create thread :
                1- extends Thread Class
                2- impplements Runabble interface

        */
//        MyThread myThread = new MyThread();
//        myThread.start();
//
//        Runnable x = new MyThread2();
//        Thread myThread2 = new Thread(x);
//        myThread2.start();


        /*
        * JOIN METHOD
        *   it make the thread called join method to execute first then calling JavaConcepts.Sorting thread
        * */


        MyThread myThread1 = new MyThread("1");
        MyThread myThread2 = new MyThread("2");
        MyThread myThread3 = new MyThread("3");

        myThread1.start();
        try {
            myThread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        myThread2.start();
        myThread3.start();


    }
}
