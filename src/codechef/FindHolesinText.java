package codechef;

import java.util.Scanner;

public class FindHolesinText
{

    public static void main( String args[] )
    {
        Scanner sc = new Scanner( System.in );

        int count = sc.nextInt();

        for ( int i = 0; i < count; i++ )
        {
            System.out.println( findNumberOfHolesInText( sc.next() ) );
        }

    }

    public static int findNumberOfHolesInText( String s )
    {
        int count = 0;

        for ( int i = 0; i < s.length(); i++ )
        {
            if ( s.charAt( i ) == 'A' || s.charAt( i ) == 'P' || s.charAt( i ) == 'O' || s.charAt( i ) == 'D' || s.charAt( i ) == 'R' )
            {
                count += 1;
            }
            else if ( s.charAt( i ) == 'B' )
            {
                count += 2;
            }
        }

        return count;
    }

}
