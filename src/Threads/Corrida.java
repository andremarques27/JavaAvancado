package Threads;

public class Corrida {

    final static int NUM_ATLETAS = 4;
    final static int DISTANCIA = 200;

    public static void main(String[] args) {

        for (int i = 1; i <= NUM_ATLETAS; i++) {
            new Corredores("Atleta" + i, DISTANCIA).start();
        }
    }
}
