package codechef;

import java.util.Scanner;

public class NumberOfZerosInFactorial
{

    public static void main( String args[] )
    {
        Scanner sc = new Scanner( System.in );

        int count = sc.nextInt();
        int[] input = new int[count];

        for ( int i = 0; i < count; i++ )
        {
            input[i] = sc.nextInt();
        }

        for ( int i = 0; i < count; i++ )
        {
            System.out.println( findNumberOfTralingZeros( input[i] ) );
        }

    }

    public static int findNumberOfTralingZeros( int a )
    {
        int numberOfZeros = 0;

        while ( a > 0 )
        {
            numberOfZeros += a / 5;
            a = a / 5;
        }

        return numberOfZeros;

    }

}
