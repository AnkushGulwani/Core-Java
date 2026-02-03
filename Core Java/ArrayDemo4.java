class Students {
    int RollNo;
    String Name;
}

public class ArrayDemo4 {
    public static void main(String[] args) {
        // ARRAY OF OBJECTS
        Students s1 = new Students();
        s1.RollNo = 1;
        s1.Name = "Aadarsh";

        Students s2 = new Students();
        s2.RollNo = 2;
        s2.Name = "Darshit";

        Students s3 = new Students();
        s3.RollNo = 3;
        s3.Name = "Harsh";

        Students stud[] = new Students[3];
        stud[0] = s1;
        stud[1] = s2;
        stud[2] = s3;

        for (int i = 0; i < stud.length; i++) {
            System.out.println(stud[i].RollNo + ":" + stud[i].Name);
        }

        // Using For-each Loop

        for (Students students : stud) {
            System.out.println(students.RollNo + ":" + students.Name);
        }

    }
}
