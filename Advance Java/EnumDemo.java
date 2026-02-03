import java.util.Arrays;

enum Status {
    Running, Failed, Pending, Success;
}

public class EnumDemo {
    public static void main(String[] args) {

        // int i = 5;
        // Status s1= Status.Running;
        // Status s1= Status.Failed;
        // Status s1= Status.NoIdea;
         Status s1= Status.Success;

        System.out.println(s1);//Success
        System.out.println(s1.ordinal());//index value of Success ie 3

        Status[] ss = Status.values();
        System.out.println(Arrays.toString(ss));

        for (Status s : ss) {
           // System.out.println(s);
            System.out.println(s + " : " + s.ordinal());
        }
    }

}