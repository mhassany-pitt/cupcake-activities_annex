// Fig. 19.7: HTTPPostServlet.java

// A simple survey servlet

import javax.servlet.*;

import javax.servlet.http.*;

import java.text.*;

import java.io.*;

import java.util.*;


public class HTTPPostServlet extends HttpServlet {
   private String animalNames[] =
      { "dog", "cat", "bird", "snake", "none" };


   public void doPost( HttpServletRequest request,
                       HttpServletResponse response )
      throws ServletException, IOException
   {
      int animals[] = null, total = 0;
      File f = new File( "survey.txt" );

      if ( f.exists() ) {
         // Determine # of survey responses so far
         try {
            ObjectInputStream input = new ObjectInputStream(
               new FileInputStream( f ) );

            animals = (int []) input.readObject();
            input.close();   // close stream

            for ( int i = 0; i < animals.length; ++i )
               total += animals[ i ];
         }
         catch( ClassNotFoundException cnfe ) {
	            cnfe.printStackTrace();
         }
      }
      else
         animals = new int[ 5 ];

      // read current survey response
      String value =
         request.getParameter( "animal" );
      ++total;   // update total of all responses

      // determine which was selected and update its total
      for ( int i = 0; i < animalNames.length; ++i )
         if ( value.equals( animalNames[ i ] ) )
            ++animals[ i ];

      // write updated totals out to disk
      ObjectOutputStream output = new ObjectOutputStream(
         new FileOutputStream( f ) );

      output.writeObject( animals );
      output.flush();
      output.close();

      // Calculate percentages
      double percentages[] = new double[ animals.length ];

      for ( int i = 0; i < percentages.length; ++i )
         percentages[ i ] = 100.0 * animals[ i ] / total;

      // send a thank you message to client
      response.setContentType( "text/html" ); // content type

      PrintWriter responseOutput = response.getWriter();
      StringBuffer buf = new StringBuffer();
      buf.append( "<html>\n" );
      buf.append( "<title>Thank you!</title>\n" );
      buf.append( "Thank you for participating.\n" );
      buf.append( "<BR>Results:\n<PRE>" );

      DecimalFormat twoDigits = new DecimalFormat("#0.00" );
      for ( int i = 0; i < percentages.length; ++i ) {
         buf.append( "<BR>" );
         buf.append( animalNames[ i ] );
         buf.append( ": " );
         buf.append( twoDigits.format( percentages[ i ] ) );
         buf.append( "%  responses: " );
         buf.append( animals[ i ] );
         buf.append( "\n" );
      }

      buf.append( "\n<BR><BR>Total responses: " );
      buf.append( total );
      buf.append( "</PRE>\n</html>" );

      responseOutput.println( buf.toString() );
      responseOutput.close();
   }

}