// Fig. 19.13: SessionExample.java
// Using sessions.
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class SessionExample extends HttpServlet {
   private final static String names[] =
      { "C", "C++", "Java", "Visual Basic 6" };
   private final static String isbn[] = {
      "0-13-226119-7", "0-13-528910-6",
      "0-13-012507-5", "0-13-528910-6" };
 
   public void doPost( HttpServletRequest request,
                       HttpServletResponse response )
      throws ServletException, IOException
   {
      PrintWriter output;
      String language = request.getParameter( "lang" );

      // Get the user's session object.
      // Create a session (true) if one does not exist.
      HttpSession session = request.getSession( true );

      // add a value for user's choice to session
      session.putValue( language, getISBN( language ) );

      response.setContentType( "text/html" );
      output = response.getWriter();

      // send HTML page to client
      output.println( "<HTML><HEAD><TITLE>" );
      output.println( "Sessions" );
      output.println( "</TITLE></HEAD><BODY>" );
      output.println( "<P>Welcome to Sessions!<BR>" );
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

      // Get the user's session object.
      // Don't create a session (false) if one does not exist.
      HttpSession session = request.getSession( false );

      // get names of session object's values
      String valueNames[];

      if ( session != null )
         valueNames = session.getValueNames();
      else
         valueNames = null;

      response.setContentType( "text/html" ); 
      output = response.getWriter();

      output.println( "<HTML><HEAD><TITLE>" );
      output.println( "Sessions II" );
      output.println( "</TITLE></HEAD><BODY>" );

      if ( valueNames != null && valueNames.length != 0 ) {
         output.println( "<H1>Recommendations</H1>" );

         // get value for each name in valueNames
         for ( int i = 0; i < valueNames.length; i++ ) {
            String value =
               (String) session.getValue( valueNames[ i ] );

            output.println(
               valueNames[ i ] + " How to Program. " +
               "ISBN#: " + value + "<BR>" );
         }
      }
      else {
         output.println( "<H1>No Recommendations</H1>" );
         output.println( "You did not select a language or" );
         output.println( "the session has expired." );
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