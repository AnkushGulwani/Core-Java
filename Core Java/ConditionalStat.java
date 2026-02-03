class ConditionalStat {
    public static void main(String[] args) {
        // IF ELSE

        int x = 18;

        if (x > 10) {
            System.out.println("Hello");
        } else {
            System.out.println("Bye");
        }

        // IF ELSE IF

        int a = 10, b = 9, c = 4;
        if (a > b && a > c) {
            System.out.println("a is greater than b and c");
        } else if (b > a && b > c) {
            System.out.println("b is greater than a and c");
        } else {
            System.out.println("c is greater than b and a");
        }

        // TERNARY
        int n = 9;

        String result = "";

        // condition ? true : false
        result = n % 2 == 0 ? "Even" : "Odd";
        System.out.println(result);

        // SWITCH

        int day = 6;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                break;
        }
    }
}
