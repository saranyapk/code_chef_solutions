package codechef;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class ReversePolishNotation
{

    static Integer max = Integer.MIN_VALUE;

    static String[] result;

    public static void main( String args[] ) throws NumberFormatException, IOException
    {
        Scanner sc = new Scanner( System.in );

        int count = sc.nextInt();

        result = new String[count];

        for ( int i = 0; i < count; i++ )
        {
            result[i] = findReversePolishNotation( sc.next() );
        }

        for ( int i = 0; i < count; i++ )
        {
            System.out.println( result[i] );
        }
    }

    public static String findReversePolishNotation( String s )
    {
        char[] c = s.toCharArray();

        StringBuffer sb = new StringBuffer();

        Stack< Character > stack = new Stack< Character >();

        for ( int j = 0; j < c.length; j++ )
        {
            if ( c[j] == '(' )
            {
                continue;
            }
            else if ( c[j] > 96 && c[j] < 123 )
            {
                sb.append( c[j] );
            }
            else if ( c[j] == ')' )
            {
                sb.append( stack.pop() );
            }
            else
            {
                stack.push( c[j] );
            }
        }

        return sb.toString();

    }

}
