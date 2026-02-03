import java.util.Scanner;

class Q1 {
    public static void main(String[] args) {
        // Calculator

        Scanner sc = new Scanner(System.in);
        double num1, num2;
        char operator;
        String again = "y";

        while (again.equalsIgnoreCase("y")) {
            System.out.println("Insert the values:-");
            num1 = sc.nextDouble();
            num2 = sc.nextDouble();

            System.out.println("Which operation do you want to perform? (+,-,*,/)");
            operator = sc.next().charAt(0);

            switch (operator) {
                case '+':
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case '/':
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error...Division by zero");
                    }
                    break;

                default:
                    System.out.println("Invalid operator!");
                    break;
            }
        System.out.println("Thank you for using our calculator...if you want to use again press (y) for YES and (n) for NO");
        again=sc.next();
        }
        System.out.println("Calculator closed....! ");
        sc.close();
    }
}
