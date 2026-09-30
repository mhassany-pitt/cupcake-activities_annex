// Fig. 3.8: WelcomeApplet2.java
// Displaying multiple strings
import javax.swing.JApplet;  // import class JApplet
import java.awt.Graphics;    // import class Graphics

public class WelcomeApplet2 extends JApplet {
   public void paint( Graphics g )
   {
      g.drawString( "Welcome to", 25, 25 );
      g.drawString( "Java Programming!", 25, 40 );
   }
}