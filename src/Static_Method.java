/*
    | STATIC METHOD (AND NON-STATIC METHOD) |

        > The...
        > If the method isn't using any instance variable and only uses its local variables or uses no variables, then that method should be a non-static method.
        > If the method uses instance variables, then the method should be a static method and object will be needed to call for that method via reference.

        > SYNTAX (Static method):
                  public static void main(String[] args)
                  {
                    // code
                  }

        > SYNTAX (Non-static method):
                  public void show()
                  {
                    // code
                  }
*/

public class Static_Method
{
    int num1; // Instance variable needed in static method ahead

    // Static method with instance variable connection via 'this.num1 (written solely as num1)'
    public static int getSquare1(int num1)
    {
        int sq1 = num1 * num1;
        return sq1;
    }

    // Non-static method with local variable num2
    public int getSquare2(int num2)
    {
        int sq2 = num2 * num2;
        return sq2;
    }

    public static void main(String[] args)
    {
        // Static method needs an indirect call via class through an object's reference, so need to create an object for this method
        Static_Method obj = new Static_Method();
        int res1 = obj.getSquare2(5);
        System.out.println(res1);

        // Non-static method is called directly via class, so no need to create an object for this method
        int res2 = Static_Method.getSquare1(8);
        System.out.println(res2);
    }
}
