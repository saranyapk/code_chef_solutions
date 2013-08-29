package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Atm
{
    public static void main( String args[] )
    {
        try
        {
            BigDecimal amtWithDraw;

            BigDecimal amtIntialAccountBalance;

            BigDecimal amtFinalAccountBalance;

            BufferedReader bufferRead = new BufferedReader( new InputStreamReader( System.in ) );

            String s = bufferRead.readLine();

            String[] tokenized = s.split( " " );

            amtWithDraw = new BigDecimal( tokenized[0] );

            amtIntialAccountBalance = new BigDecimal( tokenized[1] );

            if ( bufferRead != null )
            {
                bufferRead.close();
            }

            if ( !amtWithDraw.remainder( new BigDecimal( "5" ) ).equals( new BigDecimal( "0" ) ) )
            {
                System.out.println( amtIntialAccountBalance.setScale( 2 ) );
                return;
            }

            if ( amtWithDraw.compareTo( amtIntialAccountBalance ) != -1 )
            {
                System.out.println( amtIntialAccountBalance.setScale( 2 ) );
                return;
            }

            amtFinalAccountBalance = amtIntialAccountBalance.subtract( amtWithDraw ).subtract( new BigDecimal( 0.5 ) );

            System.out.println( amtFinalAccountBalance.setScale( 2 ) );

        }
        catch ( IOException e )
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
