class Operators {
    public static void main(String[] args) {

        // ARITHMETIC OPERATORS

        int num1 = 7;
        int num2 = 10;
        int result = num1 - num2;// similarly for +, *, /, %
        System.out.println(result);

        num1 += 2;// shorthand of num1=num1+2
        num1++;// post increment
        num1--;// post decrement
        ++num1;// pre increment
        --num1;// pre decrement
        System.out.println(num1);// 9

        // RELATIONAL OPERATORS

        int x = 6, y = 5;

        // boolean result1= x<y;
        // boolean result1= x>y;
        // boolean result1= x>=y;
        // boolean result1= x<=y;
        // boolean result1= x!=y;
        boolean result1 = x == y;
        System.out.println(result1);

        double a = 8.8;
        double b = 9.8;
        // boolean res = a<=b;
        boolean res = a >= b;

        System.out.println(res);

        // LOGICAL OPERATOR

        int x1 = 7;
        int y1 = 5;
        int a1 = 5;
        int b1 = 9;

        // boolean result3= x1>y1 && a1<b1 ;
        // boolean result3= x1>y1 || a1<b1 ;
        // boolean result3= x1>y1 && a1>b1 ;
        // boolean result3= x1>y1 || a1>b1 ;
        // boolean result3= x1<y1 && a1<b1 ;
        // boolean result3= x1<y1 || a1<b1 ;
        boolean result3 = x1 < y1 || a1 < b1 || a1 > 1;

        System.out.println(result3);

        boolean result2 = a1 > b1;
        System.out.println(!result2);

    }
}
