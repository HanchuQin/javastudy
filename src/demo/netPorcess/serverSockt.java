package demo.netPorcess;


import java.net.ServerSocket;
import java.net.Socket;

public class serverSockt {

    public static void main(String[] args) {
        try {
            ServerSocket fwd = new ServerSocket(8888);
            final Socket accept = fwd.accept();

        }catch (Exception e){
            e.getStackTrace();
        }
    }





}
