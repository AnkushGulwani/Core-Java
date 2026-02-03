class InnerClassOne {
    private int age = 23;

    public void showAge() {
        System.out.println("In Inner Class One\nAge:" + age);
    }

    public void displaySomething() {
        System.out.println("Displaying...........");
    }

    class InnerClassTwo {
        public void displayAge() {
            System.out.println("In Inner class Two\nAge:" + age);
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        InnerClassOne iOne = new InnerClassOne();
        iOne.showAge();

        InnerClassOne.InnerClassTwo iTwo = iOne.new InnerClassTwo();// to call inner class
        iTwo.displayAge();

        InnerClassOne iOne2 = new InnerClassOne() {
            public void displaySomething() {
                System.out.println("Displaying in anonymous inner class......");
            }// example of anonymous inner class
        };
        iOne2.displaySomething();
    }
}
