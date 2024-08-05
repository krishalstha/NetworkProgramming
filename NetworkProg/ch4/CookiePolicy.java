import java.net.*;
import java.sql.Connection;
import java.util.*;
public class CookiePolicy{
    public static void main(String[] args) {
        String uri = "https://google.com/";
        CookieManager cookiemanager = new CookieManager();
        CookieHandler.setDefault(cookiemanager);
        //accepts cookie from original server
        java.net.CookiePolicy cookiePolicy = java.net.CookiePolicy.ACCEPT_ORIGINAL_SERVER;

        //set the cookie policy
        cookiemanager.setCookiePolicy(cookiePolicy);
        URL url = new URL (uri);
        URLConnection connection = url.openConnection();
        Connection.getContent();
        CookieStore cookieStore = CookieManager.getcookieStore();
        List<HTTPCookie> cookieList = cookieStore.getCookies();
        for(HttpCookie cookie : cookieList){
            System.out.println("Domain Name" +cookie.getDomain());
            System.out.println("Name of the cookie" +cookie.gerName());
        }
    }
}