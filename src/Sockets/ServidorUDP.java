package Sockets;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ServidorUDP {

    public static void main(String[] args) throws Exception {

        DatagramSocket socketUDP = new DatagramSocket(2000);
        byte[] bufferArray = new byte[1024];
        DatagramPacket pacote = new DatagramPacket(bufferArray, bufferArray.length);
        socketUDP.receive(pacote);

        String texto = new String(pacote.getData(), 0, pacote.getLength());
        System.out.println(texto);

        socketUDP.close();
    }
}
