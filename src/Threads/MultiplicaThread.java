package Threads;

public class MultiplicaThread implements Runnable{

    public void run() {

        synchronized (this) {

            int multiplicacao = 1;

            for (int i = 1; i < 10; i++) {
                multiplicacao = multiplicacao * i;
                System.out.println("Multiplicação = " + multiplicacao);

                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e) {
                    e.getMessage();
                }
            }
        }
    }
}
