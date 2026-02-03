@FunctionalInterface
interface Hi {
    void sayHello();

    default void Hello() {
        System.out.println("Inside Default method");
    }

    static void Bye() {
        System.out.println("Inside static method");
    }
}

class Hi1 implements Hi {

    @Override
    public void sayHello() {
        // TODO Auto-generated method stub
        System.out.println("Inside abstract methods");
    }

}

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Hi1 h = new Hi1();
        h.Hello();
        h.sayHello();
        Hi.Bye();// Static member method getting called by its class
    }

}
