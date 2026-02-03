class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class Q3 {
    public static void checkAge(int age) throws InvalidAgeException {
        // TODO: Throw custom exception if age < 18, else print "Access granted"
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older");
        } else {
            System.out.println("Access granted");
        }

    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (InvalidAgeException e) {
            // TODO: handle exception
            System.out.println("Exception caught:" + e.getMessage());
        }
        try {
            checkAge(21);
        } catch (InvalidAgeException e) {
            // TODO: handle exception
            System.out.println("Exception caught:" + e.getMessage());
        }
    }
}
