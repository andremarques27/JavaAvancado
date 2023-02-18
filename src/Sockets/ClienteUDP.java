package Sockets;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClienteUDP {

    public static void main(String[] args) throws Exception {

        DatagramSocket socketClienteUDP = new DatagramSocket();
        String textoEnviado = "Java - Andre Marques";
        byte[] bytes = textoEnviado.getBytes();

        int porta = 2000;
        InetAddress endServer = InetAddress.getLocalHost();

        DatagramPacket pct = new DatagramPacket(bytes, bytes.length, endServer, porta);

        socketClienteUDP.send(pct);
        socketClienteUDP.close();
    }
}
