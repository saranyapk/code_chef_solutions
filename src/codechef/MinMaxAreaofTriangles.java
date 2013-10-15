package codechef;

import java.io.IOException;
import java.util.Scanner;

public class MinMaxAreaofTriangles
{

    private static long minAreaIndex = 0;
    private static long maxAreaIndex = 0;

    private static long minArea = Integer.MAX_VALUE;
    private static long maxArea = 0;

    public static void main( String args[] ) throws NumberFormatException, IOException
    {
        Scanner sc = new Scanner( System.in );

        int count = sc.nextInt();
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        int x3 = 0;
        int y3 = 0;

        for ( int i = 0; i < count; i++ )
        {
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            x3 = sc.nextInt();
            y3 = sc.nextInt();
            computeAreaOfTriangle( x1, y1, x2, y2, x3, y3, i + 1 );
        }

        System.out.println( minAreaIndex + " " + maxAreaIndex );

    }

    public static void computeAreaOfTriangle( int x1, int y1, int x2, int y2, int x3, int y3, int index )
    {
        int area = Math.abs( ( ( x1 * ( y2 - y3 ) ) + ( x2 * ( y3 - y1 ) ) + ( x3 * ( y1 - y2 ) ) ) / 2 );

        if ( area <= minArea )
        {
            minArea = area;
            minAreaIndex = index;
        }

        if ( area >= maxArea )
        {
            maxArea = area;
            maxAreaIndex = index;
        }
    }

}
