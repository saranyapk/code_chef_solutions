package codechef;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PositionAfterSortJOHNY
{

    private static List< Integer > result = new ArrayList< Integer >();

    public static void main( String[] args )
    {
        Scanner sc = new Scanner( System.in );

        int T = sc.nextInt();

        int N;
        int K;
        for ( int i = 0; i < T; i++ )
        {
            N = sc.nextInt();

            BigInteger a[] = new BigInteger[N];

            for ( int j = 0; j < N; j++ )
            {
                a[j] = sc.nextBigInteger();
            }

            K = sc.nextInt();

            result.add( findPositionAfterSort( a, K ) );
        }

        for ( Integer i : result )
        {
            System.out.println( i );
        }
    }

    public static Integer findPositionAfterSort( BigInteger a[], int K )
    {
        BigInteger value = a[K - 1];

        Arrays.sort( a );

        return Arrays.binarySearch( a, value ) + 1;

    }

}
