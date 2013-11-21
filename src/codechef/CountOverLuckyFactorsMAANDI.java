package codechef;

import java.util.*;

public class CountOverLuckyFactorsMAANDI
{

    private static List< Integer > result = new ArrayList< Integer >();

    private static Map< Long, Boolean > map = new HashMap< Long, Boolean >();

    public static void main( String[] args )
    {
        Scanner sc = new Scanner( System.in );

        int count = sc.nextInt();

        for ( int i = 0; i < count; i++ )
        {
            result.add( countOverluckyFactors( sc.nextLong() ) );
        }

        for ( Integer i : result )
        {
            System.out.println( i );
        }
    }

    public static boolean isOverLucky( long num )
    {
        if ( map.get( num ) != null )
        {
            return true;
        }
        else
        {
            String s = String.valueOf( num );

            if ( s.matches( "[0-9]*4[0-9]*" ) || s.matches( "[0-9]*7[0-9]*" ) )
            {
                map.put( num, true );
                return true;
            }
        }

        return false;
    }

    public static Integer countOverluckyFactors( long num )
    {
        long i = 4;
        int count = 0;
        while ( i <= num / 2 )
        {
            if ( num % i == 0 )
            {
                if ( isOverLucky( i ) )
                {
                    count++;
                }
            }
            i++;
        }

        if ( isOverLucky( num ) )
        {
            count++;
        }

        return count;

    }

}
