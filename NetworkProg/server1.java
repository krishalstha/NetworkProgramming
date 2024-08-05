// import java.io.*;
// import java.net.*;
// public class server1{
//     public static void main(String[] args) {

//         //initialize
//         try(ServerSocket serverSocket = new ServerSocket(8000)){

//             //establish a connection
//             Socket clientSocket = serverSocket.accept();

//             //Input Stream
//             DataInputStream datain = new DataInputStream(clientSocket.getInputStream());
    
//             String str = (String) datain.readUTF();

//             //Msg print
//             System.out.println("message:"+str);
//             serverSocket.close();
//         }

//         catch (Exception e){
//             System.out.println(e.getMessage());
//         }
//     }
// }