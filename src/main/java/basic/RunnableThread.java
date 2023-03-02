package basic;

public class RunnableThread implements Runnable{
    @Override
    public void run() {
        System.out.println("inside run method");
        printNumber();
    }

    void printNumber(){

        for (int i = 0; i <= 50; i++) {
            System.out.println("number is : " + i + " Thread is : " + Thread.currentThread());

        }
    }

    public static void main(String[] args) {
        RunnableThread obj = new RunnableThread();
        RunnableThread obj1 = new RunnableThread();

        Thread t = new Thread(obj);
        t.start();
        Thread t1 = new Thread(obj1);
        t1.start();
    }
}
