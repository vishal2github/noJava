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

public class S_NS_Method_Calls
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
        int res1 = S_NS_Method_Calls.getSquare1(8);
        System.out.println(res1);
        // or
        System.out.println(getSquare1(8));
        //or
        System.out.println(S_NS_Method_Calls.getSquare1(8));

        // Non-static method needs to be called with an object, so need to create an object for this method
        S_NS_Method_Calls obj = new S_NS_Method_Calls();
        int res2 = obj.getSquare2(5);
        System.out.println(res2);
        // or
        System.out.println(obj.getSquare2(5));
    }
}
