abstract class Super{
    abstract void show();
    void display(){
        System.out.println("Inside Normal method");
    }
}
class Sub extends Super{
    void show() {
        System.out.println("Inside Normal from abstract after overriding it");
    }
    void display(){
        System.out.println("Inside Sub class normal method");
    }
}
public class AbstractClassMethod {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Sub s=new Sub();
        s.show();
        s.display();
    }

}
