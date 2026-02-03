public class WrapperClasses {
    public static void main(String[] args) {
        int num = 7;
        Integer num1 = num;// autoboxing
        System.out.println(num1);

        int num2=num1;//autounboxing
        System.out.println(num2);

        String str="12";
        int num3=Integer.parseInt(str);
        System.out.println(num3+1); 
        String i="Abce";
        
    }
}
