package socket11thjune;
import java.net.ServerSocket;
import java.net.Socket;

public class Echoclient {
    public static void main(String[] args) {
        try{
            System.out.println("client started");
            Socket soc = new Socket ("localhost",9806);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
