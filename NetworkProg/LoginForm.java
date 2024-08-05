// import java.sql.Connection;
// import java.sql.DriverManager;

// class ConnectJDBC
// {
//    public static void main(String[] args) 
//  {
    
//     try
//      {
//         Class.forName("com.mysql.jdbc.driver");
//         String url="jdbc:mysql://localhost:3306/test";
//         String username="root";
//         String password="";
//         Connection con=DriverManager.getConnection(url,username,password);

//         if(con.isClosed())
//         {
//             System.out.println("Connection is closed");
//         }
//         else
//         {
//             System.out.println("Connection successful....");
//         }
//     } 
//     catch(Exception e)
//     {
//         e.printStackTrace();
//     }
//   }
// }