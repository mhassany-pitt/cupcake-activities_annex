// Fig. 19.9: CookieExample.java
// Using cookies.
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CookieExample extends HttpServlet {
   private String names[] = { "C", "C++", "Java",
                              "Visual Basic 6" };
   private String isbn[] = {
      "0-13-226119-7", "0-13-528910-6",
      "0-13-012507-5", "0-13-528910-6" };

   public void doPost( HttpServletRequest request,
                       HttpServletResponse response )
      throws ServletException, IOException
   {
      PrintWriter output;
      String language = request.getParameter( "lang" );

      Cookie c = new Cookie( language, getISBN( language ) );
      c.setMaxAge( 120 );  // seconds until cookie removed
      response.addCookie( c );  // must precede getWriter
      
      response.setContentType( "text/html" );
      output = response.getWriter();         

      // send HTML page to client
      output.println( "<HTML><HEAD><TITLE>" );
      output.println( "Cookies" );
      output.println( "</TITLE></HEAD><BODY>" );
      output.println( "<P>Welcome to Cookies!<BR>" );
      output.println( "<P>" );
      output.println( language );
      output.println( " is a great language." );
      output.println( "</BODY></HTML>" );

      output.close();    // close stream
   }

   public void doGet( HttpServletRequest request,
                      HttpServletResponse response )
                      throws ServletException, IOException
   {
      PrintWriter output;
      Cookie cookies[];

      cookies = request.getCookies(); // get client's cookies

      response.setContentType( "text/html" );
      output = response.getWriter();

      output.println( "<HTML><HEAD><TITLE>" );
      output.println( "Cookies II" );
      output.println( "</TITLE></HEAD><BODY>" );

      if ( cookies != null ) {
         output.println( "<H1>Recommendations</H1>" );

         // get the name of each cookie
         for ( int i = 0; i < cookies.length; i++ ) 
            output.println(
               cookies[ i ].getName() + " How to Program. " +
               "ISBN#: " + cookies[ i ].getValue() + "<BR>" );
      }
      else {
         output.println( "<H1>No Recommendations</H1>" );
         output.println( "You did not select a language or" );
         output.println( "the cookies have expired." );
      }

      output.println( "</BODY></HTML>" );
      output.close();    // close stream
   }

   private String getISBN( String lang )
   {
      for ( int i = 0; i < names.length; ++i )
         if ( lang.equals( names[ i ] ) )
            return isbn[ i ];

      return "";  // no matching string found
   }
}