// interface implementation and polymorphism in Java

interface Computer {
    void code();
}

class Laptop implements Computer {

    @Override
    public void code() {
        // TODO Auto-generated method stub
        System.out.println("Work from home");
    }

}

class Pc implements Computer {

    @Override
    public void code() {
        // TODO Auto-generated method stub
        System.out.println("On site work / In office");
    }

}

class Developer{
    public void work(Computer computer){
        computer.code();
    }
}

public class InterfaceImpConcept {
    public static void main(String[] args) {
        Computer laptop=new Laptop();
        Computer pc=new Pc();

        Developer ankush=new Developer();
        ankush.work(laptop);
        ankush.work(pc);
    }
}
