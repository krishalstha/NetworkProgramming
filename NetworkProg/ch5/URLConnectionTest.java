import java.io.*;
import java.net.*;
public class URLConnectionTest {
    public static void main(String[] args) throws Exception {
        try {
            URL u = new URL("https://run.mocky.io/v3/7dd9cc8a-a4ea-444f-b27e-c2eaefd50fba");
            URLConnection uc = u.openConnection();
            System.out.println("Content-Type: " +uc.getContentType());
        }
            catch(MalformedURLException e){
                System.out.println(e);
            }
            
        catch (IOException e) {
            System.err.println(e);
        }
    }
}

