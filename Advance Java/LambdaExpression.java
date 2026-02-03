interface hello {
    int add(int a, int b);
}

public class LambdaExpression {
    public static void main(String[] args) {
        // Lambda Exression only works with functional interface
        // First method
        hello h1 = (int a, int b) -> {
            return a + b;
        };
        System.out.println("Sum = " + h1.add(10, 20));

        // Second method
        hello h2 = (a, b) -> {
            return a + b;
        };
        System.out.println("Sum = " + h2.add(20, 20));

        // third method
        hello h3 = (a, b) -> (a - b);
        System.out.println("sub=" + h3.add(40, 38));
    }
}
