public class Casting {
    public static void main(String[] args) {
        // EX 1
        byte a = 127;
        int b;

        b = a;// IMPLICIT CONVERSION
        System.out.println(b);

        // EX 2
        float a1 = 5.76f;
        int b1 = (int) a1;// EXPLICIT CONVERSION
        System.out.println(b1);// 5

        // EX 3
        int c = 257;
        byte k = (byte) c;
        System.out.println(k);// 1

        // EX 4 (TYPE PROMOTION)
        int by1 = 10;
        int by2 = 20;
        int result = by1 * by2;
        System.out.println(result); // converts value of byte to int 

    }
}
