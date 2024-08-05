import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class DecoderTest {
    public static void main(String[] args) {
        String input = "https://www.facebook.com/marketplace/?ref=bookmark";
        try {
            String output = URLDecoder.decode(input, "UTF-32");
            System.out.println(output);
        } catch (UnsupportedEncodingException ex) {
            throw new RuntimeException("Broken VM does not support UTF-8");
        }
    }
}
