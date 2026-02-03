class Stud {
    private int RollNo;
    private String Name;

    public Stud() {// Default constructor
        // Constructor returns no type and has same name as class
        System.out.println("Constructor called");
        // RollNo=12;
        // Name="Aman";
    }

    public Stud(int r, String n) {// Parameterized Constructor
        RollNo = r;
        Name = n;
    }

    public void setRoll(int RollNo) {
        this.RollNo = RollNo;
    }

    public int getRoll() {
        return RollNo;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    // Getter Setters
    public void show() {
        System.out.println("Object Created");
    }
}

class EncapsulationDemo {
    public static void main(String[] args) {
        Stud obj1 = new Stud();
        obj1.setName("Ankush");
        obj1.setRoll(7);
        System.out.println(obj1.getRoll() + ":" + obj1.getName());

        Stud obj2 = new Stud(12, "Sanjay");
        System.out.println(obj2.getRoll() + ":" + obj2.getName());

        // Anonymous Objects

        new Stud().show();// cant be reused again
        // new Stud() creates a new anonymous object

    }
}