package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LifeUniverseEverything
{

    public static void main( String args[] ) throws IOException
    {
        BufferedReader bufferRead = new BufferedReader( new InputStreamReader( System.in ) );

        String s = bufferRead.readLine();

        int a = new Integer( s ).intValue();

        while ( a != 42 )
        {
            System.out.println( a );

            s = bufferRead.readLine();

            a = new Integer( s ).intValue();

        }

    }

}
