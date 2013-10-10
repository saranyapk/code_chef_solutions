package codechef;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FibonacciNoModulo
{

    private static ArrayList< Double > result = new ArrayList< Double >();
    private static Map< Integer, Double > fibonacci = new HashMap< Integer, Double >();

    public static void main( String args[] ) throws NumberFormatException, IOException
    {
        Scanner sc = new Scanner( System.in );

        int count = sc.nextInt();
        double c;
        double p;

        for ( int i = 0; i < count; i++ )
        {
            c = sc.nextDouble();
            p = sc.nextDouble();
            result.add( findFibonacciNumber( c, p ) );
        }

        for ( Double res : result )
        {
            System.out.println( res );
        }

    }

    public static double findFibonacciNumber( double c, double p )
    {
        double n = -1;

        for ( int i = 0; i <= Integer.MAX_VALUE; i++ )
        {
            double fibo = fibonacci( i );
            fibonacci.put( i, fibo );
            if ( ( ( fibo - c ) % p ) == 0 )
            {
                n = i;
                break;
            }
        }

        return n;

    }

    public static double fibonacci( int n )
    {
        Double fibo = fibonacci.get( n );

        if ( fibo != null )
        {
            return fibo;
        }
        else if ( n <= 1 )
        {
            return n;
        }
        else
        {
            return fibonacci( n - 1 ) + fibonacci( n - 2 );
        }
    }
    /* 
     *         long res = c % p;
    long previousFibo = 0;
    long currentFibo = 0;

           int k = Integer.MAX_VALUE;

            for ( int a = 0; a < p; a++ )
            {
                previousFibo = currentFibo;
                currentFibo = fibonacci( a );
                fibonacci.put( a, currentFibo );
                if ( c >= previousFibo && c <= currentFibo )
                {
                    k = a;
                    break;
                }
            }

            long pisanoPeriod = 4 * k;*/
}
