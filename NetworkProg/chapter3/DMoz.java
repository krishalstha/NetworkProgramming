import java.io.*;
import java.net.*;

public class DMoz {
    public static void main(String[] args) {
        String target = "";
        for (int i = 0; i < args.length; i++) {
            target += args[i] + " ";
        }
        target = target.trim();
        
        try {
            String query = URLEncoder.encode(target, "UTF-8");
            URL u = new URL("http://search.dmoz.org/cgi/search?Search=" + query);
            InputStream in = new BufferedInputStream(u.openStream());
            InputStreamReader theHTML = new InputStreamReader(in);
            int c;
            while ((c = theHTML.read()) != -1) {
                System.out.print((char) c);            
            }
        } catch (MalformedURLException ex) {
            System.err.println(ex);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
