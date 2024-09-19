/*
    | FOR LOOP |

        > Syntax:
                for(initialization; condition; updation)
                {
                    // code
                }
*/


// Program shows the simple for loop usage.

package For_Loop;

public class ForLoop
{
    public static void main(String[] args)
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println(i);
        }

        System.out.println();

        for(int i = 5; i >= 1; i--)
        {
            System.out.println(i);
        }
    }
}
