// import java.io.*;
// import java.net.*;
// public class client1{
//     public static void main(String[] args) {

//         //initialize
//         try(Socket socket = new Socket("localhost",8000)){

//             //Input Stream
//             DataOutputStream dataout = new DataOutputStream(socket.getOutputStream());
//             dataout.writeUTF ("Hello echo server from client side");

//             //Msg print
//             dataout.close();
//             dataout.flush();
//             socket.close();
//         }

//         catch (Exception e){
//             System.out.println(e.getMessage());
//         }
//     }
// }