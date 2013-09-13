package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumInTriangles
{
    static Integer max = Integer.MIN_VALUE;

    static int[] result;

    public static void main( String args[] ) throws NumberFormatException, IOException
    {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

        int count = Integer.parseInt( br.readLine() );

        result = new int[count];

        for ( int i = 0; i < count; i++ )
        {
            int arraySize = Integer.parseInt( br.readLine() );

            int[][] array = new int[arraySize][arraySize];

            for ( int j = 0; j < arraySize; j++ )
            {
                String s = br.readLine();

                String[] tokenized = s.split( " " );

                for ( int k = 0; k < ( j + 1 ); k++ )
                {
                    array[j][k] = Integer.valueOf( tokenized[k] );

                }
            }

            findMaxPath( array );

            result[i] = max;
        }

        for ( int i = 0; i < count; i++ )
        {
            System.out.println( result[i] );
        }

    }

    public static void findMaxPath( int[][] a )
    {

        max = Integer.MIN_VALUE;

        calMax( a, 0, 0, a.length, 0 );

    }

    public static void calMax( int[][] a, int i, int j, int length, int calMax )
    {
        calMax += a[i][j];

        if ( i == ( length - 1 ) )
        {
            if ( max < calMax )
            {
                max = calMax;
            }
            return;
        }

        calMax( a, i + 1, j, length, calMax );

        calMax( a, i + 1, j + 1, length, calMax );

    }

}
