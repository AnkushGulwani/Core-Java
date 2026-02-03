class Phone {
    public void playMusic() {
        System.out.println("Playing music....!");
    }

    public int calc(int num1, int num2) {
        System.out.println("In calc");
        return num1 + num2;
    }

    public int calc(int num1, int num2, int num3) {
        System.out.println("In calc");
        return num1 + num2 + num3;// method overloading concept=> same method name with different parameteres
    }
}

public class ClassObject {
    public static void main(String[] args) {
        Phone comp = new Phone();
        comp.playMusic();
        int result = comp.calc(12, 13);
        System.out.println(result);
    }
}
