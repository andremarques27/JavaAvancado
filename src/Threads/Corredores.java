package Threads;

public class Corredores extends Thread {

    String nome;
    int distaciaCorrida = 0;
    int distanciaTotalCorrida;
    int passo = 0;
    static int colocacao = 0;
    final static int DISTANCIA_ATUAL = 50;

    public Corredores(String nome, int distanciaTotalCorrida) {
        this.distanciaTotalCorrida = distanciaTotalCorrida;
        this.nome = nome;
    }

    public void atletaImprimeSituacao() {
        System.out.println("O " + nome + " correu " + passo + "cm");

        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void atletaCorrendo() {
        passo = (int) (Math.random() * DISTANCIA_ATUAL);
        distaciaCorrida += passo;
        if (distaciaCorrida > distanciaTotalCorrida) {
            distaciaCorrida = distanciaTotalCorrida;
        }
    }

    public void atletaDescansando() {
        Thread.yield();
    }

    public void colocacaoAtleta() {
        colocacao++;
        System.out.println("***" + nome + " foi o " + colocacao + " colocado - Distância percorrida " + distanciaTotalCorrida + "m");
    }

    public void run() {
        synchronized (this) {
            while (distaciaCorrida < distanciaTotalCorrida) {
                atletaCorrendo();
                atletaImprimeSituacao();
                atletaDescansando();
            }
            colocacaoAtleta();
        }
    }
}
