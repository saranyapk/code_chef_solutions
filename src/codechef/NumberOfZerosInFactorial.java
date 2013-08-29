package codechef;

import java.util.Scanner;

public class NumberOfZerosInFactorial
{
    /**For example, they defined the function Z. For any positive integer N,
    Z(N) is the number of zeros at the end of the decimal form of number
    N!.
    
    Input

    There is a single positive integer T on the first line of input (equal to about 100000). It stands
    for the number of numbers to follow. Then there are T lines, each containing
    exactly one positive integer number N,
    1 <= N <= 1000000000.

    Output

    For every number N, output a single line containing the single non-negative
    integer Z(N).
    Example

    Sample Input:

    6
    3
    60
    100
    1024
    23456
    8735373

    Sample Output:

    0
    14
    24
    253
    5861
    2183837
    */
    
    
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
