package codechef;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ToQueueOrNotToQueue
{


    private static ArrayList< Integer > result = new ArrayList< Integer >();

    public static void main( String args[] ) throws NumberFormatException, IOException
    {
        Scanner sc = new Scanner( System.in );

        int count = sc.nextInt();

        int n;
        int k;
        int answer;
        String op;

        for ( int i = 0; i < count; i++ )
        {
            n = sc.nextInt();
            k = sc.nextInt();
            answer = sc.nextInt();
            int[] a = new int[n];
            for ( int j = 0; j < n; j++ )
            {
                a[j] = sc.nextInt();
            }
            op = sc.next();
            result.add( doCode( n, k, answer, op, a ) );

        }

        for ( Integer res : result )
        {
            System.out.println( res );
        }

    }

    public static int doCode( int N, int K, int answer, String operator, int[] a )
    {
        for ( int i = 1; i <= K; i++ )
        {
            for ( int j = 0; j < N; j++ )
            {
                if ( operator.equals( "AND" ) )
                {
                    answer = answer & a[j];
                }
                else if ( operator.equals( "XOR" ) )
                {
                    answer = answer ^ a[j];
                }
                else if ( operator.equals( "OR" ) )
                {
                    answer = answer | a[j];
                }
            }
        }
        return answer;
    }

}
