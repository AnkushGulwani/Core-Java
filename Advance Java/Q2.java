public class Q2 {
    public static void main(String[] args) {
        int numerator = 50, denomenator = 0;
       

        try {
             int result=numerator/denomenator;
             System.out.println(result);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Cannot divide by zero");
        }
        System.out.println("Program completed");
    }
}
