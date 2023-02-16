package Threads;

public class SomaThread  implements Runnable{

    public void run(){

        synchronized (this){

            int soma = 0;

            for (int i = 0; i < 5; i++) {
                soma = soma + 1;
                System.out.println("Soma = " + soma);

                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e) {
                    e.getMessage();
                }
            }
        }
    }
}
