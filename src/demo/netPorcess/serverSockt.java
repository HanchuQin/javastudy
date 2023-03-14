package demo.netPorcess;


import jdk.management.resource.internal.inst.SocketInputStreamRMHooks;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class serverSockt {

    public static void main(String[] args) {

        try {
            Socket fwd = new Socket("127.0.0.1",8888);




        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }



}
