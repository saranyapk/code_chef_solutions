package codechef;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfCombinationsMCHAIRS
{

    private static List< BigInteger > result = new ArrayList< BigInteger >();

    public static void main( String[] args )
    {
        Scanner sc = new Scanner( System.in );

        int T = sc.nextInt();

        for ( int i = 0; i < T; i++ )
        {
            result.add( findSumofPermutations( sc.nextBigInteger() ) );
        }

        for ( BigInteger i : result )
        {
            System.out.println( i );
        }
    }

    public static BigInteger findSumofPermutations( BigInteger num )
    {
        BigInteger result = ( new BigInteger( "2" ) ).modPow( num, new BigInteger( "1000000007" ) ).subtract( new BigInteger( "1" ) );

        return result;

    }

}
