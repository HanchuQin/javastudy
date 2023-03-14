package demo.netPorcess;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpSocket {

    public static void main(String[] args) throws Exception {
        InetAddress address = InetAddress.getByName("127.0.0.1");
        DatagramSocket udpc = new DatagramSocket(8888,address);

        String msg ="你好,李亭静";
         byte[] zfsj = msg.getBytes();
        final DatagramPacket pack = new DatagramPacket(zfsj,0,zfsj.length,address,8888);

        udpc.send(pack);

        udpc.close();



















    }

















}
