package SistemaSocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Cliente {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost", 1212);

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintStream out = new PrintStream(socket.getOutputStream());

        System.out.println("Enviando dados do pagamento");

        out.println("Pagamento");
        out.println(1);
        out.println("Andre Marques;655489789548489748;02/2023;3;890.00");

        String status = in.readLine();

        if (status.equals("OK")) {
            System.out.println("Pagamento realizado!");
        }else {
            System.out.println("Pagamento falhou: " + status);
        }

        socket.close();
    }
}
