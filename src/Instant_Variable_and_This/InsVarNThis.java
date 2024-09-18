/*
    | INSTANCE VARIABLE |

    | THIS |

        > It is a keyword.
*/


// Program showing relation between 'instant-variable' and 'this'.

package Instant_Variable_and_This;

public class InsVarNThis
{
    private int num = 65; // Instance variable

    public void show()
    {
        int num = 45;
        System.out.println(num); // Now, compiler-automated 'this' won't apply, as num is also defined locally
        System.out.println(this.num); // Here, to print 65 value of an instance 'num', manual calling will be necessary
    }

    public static void show2(int num)
    {
        System.out.println(num);
        // System.out.println(this.num); // Error: 'this' keyword can't be used with Static method
    }

    public static void main(String[] args)
    {
        // Non-static method call
        InsVarNThis obj = new InsVarNThis();
        obj.show();

        // Static method call
        InsVarNThis.show2(2);
    }
}
