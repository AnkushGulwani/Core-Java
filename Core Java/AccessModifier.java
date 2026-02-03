import Calculator.*;

public class AccessModifier {
    public static void main(String[] args) {
        Aa obj = new Aa();
        System.out.println(obj.marks);
        obj.show();
        // PUBLIC can be accessed from anywhere

        // PRIVATE can be only used in same class

        // DEFAULT accessible only within same package

        // PROTECTED → accessible within the same package and subclasses (even in
        // different packages).
    }
}
