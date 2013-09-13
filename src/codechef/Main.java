package codechef;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main
{

    public static void main( String args[] ) throws NumberFormatException, IOException
    {

        Scanner sc = new Scanner( System.in );

        int result = 0;

        int count = sc.nextInt();

        StringBuffer s = new StringBuffer();

        for ( int i = 0; i < count; i++ )
        {
            String newS = null;

            String operator = sc.next();

            if ( operator.equals( "+" ) )
            {
                String add = sc.next();

                newS = s.append( add ).toString();
            }
            else if ( operator.equals( "-" ) )
            {
                newS = s.substring( 1 );
            }

            result += findNumberOfDistinctSubString( newS );

            s = new StringBuffer( newS );

        }

        System.out.println( result % 1000000007 );
    }

    public static int findNumberOfDistinctSubString( String a )
    {
        Set< String > subString = new HashSet< String >();

        for ( int i = 1; i < a.length(); i++ )
        {
            for ( int j = 0; j < ( a.length() - i ); j++ )
            {
                subString.add( a.substring( j, j + i ) );
            }
        }

        return subString.size() + 1; // The String itself is the subString , so add 1
    }
}
