package Sockets;

import java.io.*;
import java.net.Socket;

public class ClienteTCP {

    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("localhost", 2000);

        InputStream imput = socket.getInputStream();
        OutputStream output = socket.getOutputStream();

        DataInputStream dImput = new DataInputStream(imput);
        DataOutputStream dOutput = new DataOutputStream(output);

        dOutput.writeInt(30);
        int valIncremento = dImput.readInt();

        System.out.println(valIncremento);

        socket.close();
    }
}
