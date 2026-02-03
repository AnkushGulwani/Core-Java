import Calculator.CalcOperations;

public class PacakgeDemo {
    public static void main(String[] args) {

        CalcOperations obj = new CalcOperations();
       int r1= obj.add(9, 9);
       int r2= obj.sub(9, 9);
       int r3= obj.multi(9, 9);
       int r4= obj.div(9, 9);

       System.out.println(r1+":"+r2+":"+r3+":"+r4);
    }
}
