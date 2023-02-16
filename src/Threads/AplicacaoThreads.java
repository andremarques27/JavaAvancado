package Threads;

public class AplicacaoThreads {

    public static void main(String[] args) {

        SomaThread st = new SomaThread();
        MultiplicaThread mt = new MultiplicaThread();

        Thread t1 = new Thread(st);
        Thread t2 = new Thread(mt);

        t1.start();
        synchronized (t1) {
            try {
                t1.sleep(2000);
                t1.wait();
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            t1.notify();
        }

        t2.start();
        synchronized (t2) {
            try {
                t2.sleep(2000);
                t2.wait();
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            t2.notify();
        }
    }
}
