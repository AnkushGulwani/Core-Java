interface Machine {
    String start();
}

abstract class Appliance implements Machine {
    String name;

    public Appliance(String name) {
        this.name = name;
    }

}

class Fan extends Appliance {

    public Fan(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String start() {
        return "Fan is running";
    }

}

class WashingMachine extends Appliance {

    public WashingMachine(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String start() {
        return "Washing Machine is operating";
    }

}

public class Q1 {
    public static void main(String[] args) {
        Machine fan = new Fan("Fan");
        Machine washer = new WashingMachine("Washing Machine");

        String r1 = fan.start();
        String r2 = washer.start();

        System.out.println(r1 + "\n" + r2);
    }
}
