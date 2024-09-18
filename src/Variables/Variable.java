/*
    | VARIABLES |

        > It is named space reserved by program in memory to keep data.
        > Runtime environment will allocate space in memory to the program on program's demand.
        > Command to reserve this space in memory should be as follows:
        > SYNTAX: <datatype> <variable_name>;
*/


// Program shows variables.

package Variables;

public class Variable
{
    public static void main(String[] args)
    {
        byte v1 = 3;
        short v2 = 34;
        int v3 = 53;
        long v4 = 1233445L;
        float v5 = 3.43f;
        double v6 = 54.5445d;
        boolean v7 = true;
        char v8 = 'c';

        // Above, v1, v2, v3, v4, v5, v6, v7, v8 are the variables.
        // Those variables are declared and initialized simultaneously, hence knows as initialized-variables.

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        System.out.println(v5);
        System.out.println(v6);
        System.out.println(v7);
        System.out.println(v8);
    }
}
