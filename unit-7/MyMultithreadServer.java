import java.io.*;
import java.net.*;

public class MyMultithreadServer {
  public static void main(String[] args) {
    try {
      ServerSocket ss = new ServerSocket(6666);
      while (true) {
        Socket s = ss.accept();// establishes connection

        // create a new thread object
        Runnable runnable = new Runnable() {
          @Override
          public void run() {
            try {
              // TODO Auto-generated method stub

              DataInputStream dis = new DataInputStream(s.getInputStream());

              String str = (String) dis.readUTF();

              System.out.println("message= " + str);

              System.out.println("New client connected: "
                  + s.getInetAddress()
                      .getHostAddress());

              s.close();
            } catch (Exception e) {
              e.printStackTrace();
            }
          }
        };

        // This thread will handle the client
        // separately
        new Thread(runnable).start();
      }

      // ss.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
