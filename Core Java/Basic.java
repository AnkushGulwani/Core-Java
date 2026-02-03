class Basic {
    public static void main(String[] args) {
        // Basic start
        System.out.println("Hello World.....");

        // VARIABLES

        int num1 = 3;
        int num2 = 7;
        int result = num1 + num2;

        System.out.println(result);

        //FINAL Keyword
        final int num=9;
        //num=17;error
        //System.out.println(num); 9
        //if class is made FINAL no one can extend / inherit it
        //if method is made FINAL no one can override your method
        

        /*
         * DATATYPES:-
         * PRIMITIVE-> INTEGER(BYTE, SHORT, INT, LONG), FLOAT(DOUBLE, FLOAT),
         * CHARACTER(CHAR), BOOLEAN(TRUE & FALSE)
         * INT - 4 BYTES, LONG - 8 BYTES, SHORT - 2 BYTES, BYTE - 1 BYTE
         * FLOAT - 4 BYTES, DOUBLE- 8 BYTES (DEFAULT ON JAVA), CHAR - 2 BYTES
         * NON PRIMITIVE-> ARRAY, STRING,
         */

        // LITERALS

        int num3 = 0b101; // 5
        System.out.println(num3);

        int num4 = 10_00_000;
        System.out.println(num4);

        char c = 'a';
        c++;// a becomes b
        System.out.println(c);
    }
}

//Camel Casing=> showMyMarks()

//class and interface=> Calc, Runnable
//variable and method=> marks, show()
//constants=> PIE, BRAND


