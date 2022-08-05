package week02;

public class PrimitiveExamples {

    public static void main(String[] args) {

        //Variable: Primitive types: Numbers, characters, boolean

        /*
        Numbers: Integers ----> byte - > short -> int -> long ->
                 Decimals(floating points) ---> float and double
         Characters: char data type
                     not primitive however String : collection of chars

         */
        //DataType

        /*
        DataType variable name = Value; 1. Declare and 2. initialize at the same

        Or

        DataType variableName; 1. Declare
        variableName = Value;


         */

        byte num1; // Declare a variable
        num1=123; // Initiliaze, assign a value
        num1 = 121; // re-assign a different value

        short num2 = 12398; // decalare and initialize at the same time

        int distance = 1_000_000_000;

        System.out.println("distance = " + distance);

        long distanceMore = 3_000_000_000L; // passing the limit so I have to put L
        long distanceShort = 1_000_000_000; // within the range

        float rate = 1000.5F;
        double dNumber = 123.4;

        System.out.println("-------Castings-------");
        // I will assign num1 which is byte data type to num2 ----------> from smaller dataType to bigger dataType
        num2 = num1; // there is implicit casting

        // I will assign distance variable value to num2 variable -----> from bigger to a smaller dataType. there will be data loss

        num2 = (short) distance;

        System.out.println("num2 = " + num2);



    }
}
