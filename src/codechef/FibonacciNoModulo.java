package codechef;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FibonacciNoModulo
{

    private static ArrayList< BigInteger > result = new ArrayList< BigInteger >();
    private static Map< BigInteger, BigInteger > fibonacci = new HashMap< BigInteger, BigInteger >();

    public static void main( String args[] ) throws NumberFormatException, IOException
    {
        Scanner sc = new Scanner( System.in );

        int count = sc.nextInt();
        BigInteger c;
        BigInteger p;

        for ( int i = 0; i < count; i++ )
        {
            c = sc.nextBigInteger();
            p = sc.nextBigInteger();
            result.add( findFibonacciNumber( c, p ) );
        }

        for ( BigInteger res : result )
        {
            System.out.println( res );
        }

    }

    public static BigInteger findFibonacciNumber( BigInteger c, BigInteger p )
    {
        BigInteger n = new BigInteger( "-1" );

        for ( BigInteger i = BigInteger.ZERO; i.compareTo( new BigInteger( "" + Integer.MAX_VALUE ) ) <= 0; i = i.add( BigInteger.ONE ) )
        {
            BigInteger fibo = fibonacci( i );

            fibonacci.put( i, fibo );

            if ( ( fibo.subtract( c ) ).mod( p ).compareTo( BigInteger.ZERO ) == 0 )
            {
                n = i;
                break;
            }
        }

        return n;

    }

    public static BigInteger fibonacci( BigInteger n )
    {
        BigInteger fibo = fibonacci.get( n );

        if ( fibo != null )
        {
            return fibo;
        }
        else if ( n.compareTo( BigInteger.ONE ) <= 0 )
        {
            return n;
        }
        else
        {
            return fibonacci( n.subtract( BigInteger.ONE ) ).add( fibonacci( n.subtract( new BigInteger( "2" ) ) ) );
        }
    }

}
