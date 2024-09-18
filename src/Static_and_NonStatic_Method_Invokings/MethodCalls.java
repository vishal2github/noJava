/*
    | STATIC METHOD |

        > These methods are defined by using static modifier.
        > If instance variable aren't required inside method then make that method static.
        > Object reference isn't required to call static method.
        > Only class name is required to call static method.

    | NON-STATIC METHOD |

        > These methods are defined without using static modifier.
        > If instance variable are required inside method then make that method non-static.
        > Object reference is required to call non-static method.
        > An object's variable is created and the reference is passed to call that method.
*/


// Program shows the invoking/calling techniques for static and non-static methods.

package Static_and_NonStatic_Method_Invokings;

public class MethodCalls
{
    // Static method: Called directly using class name
    public static int getSquare1(int num1)
    {
        return num1 * num1;
    }

    // Non-static method: Called via an object
    public int getSquare2(int num2)
    {
        return num2 * num2;
    }

    public static void main(String[] args)
    {
        // Static method is called directly via class, so no need to create an object (reference) for this method
        int res1 = MethodCalls.getSquare1(8);
        System.out.println(res1);
        // or
        System.out.println(getSquare1(8));
        //or
        System.out.println(MethodCalls.getSquare1(8));

        // Non-static method needs to be called with an object, so need to create an object for this method
        MethodCalls obj = new MethodCalls();
        int res2 = obj.getSquare2(5);
        System.out.println(res2);
        // or
        System.out.println(obj.getSquare2(5));
    }
}
