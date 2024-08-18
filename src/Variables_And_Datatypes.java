/*
    :: VARIABLES ::

        > It is named space reserved by program in memory to keep data.
        > Runtime environment will allocate space in memory to the program on program's demand.
        > Command to reserve this space in memory should be as follows:
        > SYNTAX: <datatype> <variable_name>;


    :: DATATYPES ::

        > Datatype will provide variable's size and type.
        > Datatypes are divided into two categories:
            >> Primitive datatypes
            >> Non-primitive datatypes


    :: PRIMITIVE DATATYPES ::

        > Every programming language provides set of primitive datatypes.
        > These datatypes are system defined (in-built) datatypes.
        > There are 8 types of primitive datatypes.
            >> byte (8bits, Integer value)
            >> short (16bits, Integer value)
            >> int (32bits, Integer value)
            >> long (64bits, Integer value)
            >> float (32bits, Decimal value)
            >> double (64bits, Decimal value)
            >> boolean (1bit, true or false)
            >> char (16bits, Character value)


    :: NON-PRIMITIVE DATATYPES ::

        > Also known as user-defined datatypes.
        > Every class and interface in java are non-primitive datatype.
        > String is most widely used non-primitive datatype.
*/

public class Variables_And_Datatypes
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
