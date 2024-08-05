import java.net.*;
public class URISplitter {
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++){
            try{
                URI u = new URI(args[i]);
                System.out.println("The URI is" + u);
                if(u.isOpaque()){
                    System.out.println("This is a opaque URI");
                    System.out.println("The scheme is " + u.getSchemeSpecificPart());
                    System.out.println("The fragment ID is " + u.getFragment());
                }
                    else{
                        System.out.println("This is hierarchial URI");
                        System.out.println("The scheme is " + u.getScheme());
                        try {
                            
                            u = u.parseServerAuthority();
                            System.out.println("This is host" + u.getUserInfo());
                            System.out.println("The port is" + u.getPort());
                        } catch (URISyntaxException ex) {
                            // TODO: handle exception
                            System.out.println("The autority is " + u.getAuthority());
                            System.out.println("The path is " + u.getPath());
                            System.out.println("the querry String is " + u.getQuery());
                            System.out.println("The fragment ID is " + u.getFragment());

                        }

                    
                }
            }catch(URISyntaxException ex) {
                System.err.println(args[i] + "doesnot seem to be an URI");

            }
            System.out.println();
        }
        
    }
}
