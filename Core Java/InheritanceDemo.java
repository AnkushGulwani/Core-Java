class Calc {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

class AdvCalc extends Calc {// SIngle lvl inheritance
    public int multi(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}

class SciCalc extends AdvCalc{// Multilevel Inheritance
    public double power(int a, int b) {
        return Math.pow(a, b);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        SciCalc obj = new SciCalc();
        int r1 = obj.multi(8, 8);
        System.out.println(r1);

        double r2 = obj.power(2, 3);
        System.out.println(r2);
    }
}

//Multiple inh will not work in java due to ambiguity