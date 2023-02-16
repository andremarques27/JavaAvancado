package Sockets;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServicoTCP {

    public static void main(String[] args) throws IOException {

        ServerSocket servidor = new ServerSocket(2000);

        Socket cliente;
        cliente = servidor.accept();

        InputStream is;
        OutputStream os;
        is = cliente.getInputStream();
        os = cliente.getOutputStream();

        DataInputStream dImput = new DataInputStream(is);
        DataOutputStream dOutput = new DataOutputStream(os);

        int val;
        val = dImput.readInt();
        System.out.println(val);
        val++;

        dOutput.writeInt(val);

        cliente.close();
        servidor.close();
    }
}
