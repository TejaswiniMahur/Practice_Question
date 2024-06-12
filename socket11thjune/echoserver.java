package socket11thjune;
import java.net.ServerSocket;
import java.net.Socket;

public class echoserver{
    public static void main(String[] args) {
        try{
            System.out.println("waiting for client");
            ServerSocket ss = new ServerSocket(9806);
            Socket soc = ss.accept();
            System.out.println("connection established");
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
