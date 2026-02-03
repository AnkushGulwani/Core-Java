class Computer{
    public void show(){
        System.out.println("In Computer");
    }
}

class Laptop extends Computer{
    public void show(){
        System.out.println("In Laptop");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Laptop obj;
        obj=new Laptop();// Upcasting

        obj.show();//In Laptop

        Laptop obj1= obj;//Downcasting
        obj1.show();

    }
}
