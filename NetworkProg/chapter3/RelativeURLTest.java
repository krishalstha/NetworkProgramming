// import java.applet.*;
// import java.awt.*;
// import java.net.*;

// public class RelativeURLTest extends Applet{
//     public void init(){
//         try {
//             URL base = this.getDocumentBase();
//             URL relative = new URL(base, "mailinglists.html");
//             this.setLayout(new GridLayout(2,1));
//             this.add(new Label(base.toString()));
//             this.add(new Label(base.toString()));
//             this.add(new Label(relative.toString()));
//         } catch (MalformedURLException ex) {
//             // TODO: handle exception
//             this.add(new Label("This shouldn't happen!"));
//         }
//     }
// }
