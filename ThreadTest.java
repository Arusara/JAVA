


class A implements Runnable {

    @Override
    public void run() {

        for(int i=0;i<5;i++) {
            System.out.println("Hi from thread A");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable {

    @Override
    public void run() {
        for (int i=0;i<5;i++) {
            System.out.println("Hi from thread B");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



public class ThreadTest {

    public static void main(String[] args) throws InterruptedException {

        Runnable a = new A();
        Runnable b = new B();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        Thread.sleep(10);
        t2.start();

        t1.join();
        t2.join();

        System.out.println("bye");


    }
}
