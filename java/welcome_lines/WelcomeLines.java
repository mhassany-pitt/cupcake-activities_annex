// Fig. 3.10: WelcomeLines.java

// Displaying text and lines

import java.awt.*;

import java.applet.*;


public class WelcomeLines extends Applet {
     public void paint( Graphics g )
     {
          g.drawLine( 15, 10, 210, 10 );
          g.drawLine( 15, 30, 210, 30 );
          g.drawString( "Welcome to Java Programming!", 25, 25 );
     }
}