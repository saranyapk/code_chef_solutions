package codechef;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AmbiguousInversePermutation
{

    static Integer max = Integer.MIN_VALUE;

    static List< String > result = new LinkedList< String >();

    public static void main( String args[] ) throws NumberFormatException, IOException
    {
        Scanner sc = new Scanner( System.in );

        int permCount = sc.nextInt();

        while ( permCount != 0 )
        {
            int[] array = new int[permCount + 1];

            for ( int j = 1; j <= permCount; j++ )
            {
                array[j] = sc.nextInt();
            }

            result.add( isInversePermutationAmbiguous( array ) );

            permCount = sc.nextInt();
        }

        for ( String r : result )
        {
            System.out.println( r );
        }
    }

    public static String isInversePermutationAmbiguous( int[] a )
    {
        int[] inverseArray = new int[a.length];

        for ( int i = 1; i < a.length; i++ )
        {
            inverseArray[a[i]] = i;
        }

        for ( int i = 0; i < a.length; i++ )
        {
            if ( inverseArray[i] != a[i] )
            {
                return "not ambiguous";
            }
        }

        return "ambiguous";
    }

}
