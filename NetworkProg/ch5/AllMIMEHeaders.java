import java.net.URL;
import java.net.URLConnection;

public class AllMIMEHeaders {

	public static void main(String[] args) {
		try {
			
			URL u = new URL("https://run.mocky.io/v3/7dd9cc8a-a4ea-444f-b27e-c2eaefd50fba");
			URLConnection uc = u.openConnection();
			
			for (int i = 0; ; i++) {
				String header = uc.getHeaderField(i);
				if(header == null) {
					break;
				}
				System.out.println(uc.getHeaderFieldKey(i) + " : " + header); 
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}