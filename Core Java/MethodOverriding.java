class C {
    public void show() {
        System.out.println("In C Show");
    }

    public int add(int n, int m) {
        return n + m;
    }
}

class D extends C {
    public void show() {
        System.out.println("IN D Show");// overrides class C Show
    }

    public int add(int n, int m) {
        return n + m - 1;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        D obj = new D();
        obj.show();
        int r = obj.add(2, 2);// 4-1
        System.out.println(r);
    }
}
