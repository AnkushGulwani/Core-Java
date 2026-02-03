class Mobile {
    String Brand;
    int price;
    static String RAM_ROM;// use of static variable can be initialised using class name

    public void show() {
        System.out.println(Brand + ":" + price + ":" + RAM_ROM);
    }

    public static void show1(Mobile object) {// Static method
        System.out.println("In static method");
        System.out.println(object.Brand + ":" + object.price + ":" + RAM_ROM);

        // we cant call non static variable inside static methods directly need to give
        // reference....also static methods can be directly called using class name
    }

    static {// static block is used to initialize static variables
        System.out.println("inside static block");
        RAM_ROM = "12_256GB";
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.Brand = "Samsung";
        obj1.price = 45000;

        Mobile obj2 = new Mobile();
        obj2.Brand = "Apple";
        obj2.price = 90000;

        // Mobile.RAM_ROM = "8_128";
        obj1.show();
        obj2.show();

        Mobile.show1(obj2);
    }
}
