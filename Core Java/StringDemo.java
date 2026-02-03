public class StringDemo {
    public static void main(String[] args) {
        String str = new String("Ankush");

        System.out.println(str + ":" + str.hashCode());
        // System.out.println(str.charAt(0));
        // System.out.println("Hi "+str);
        // System.out.println(str.concat(" Gulwani"));

        str = str + " Gulwani";
        System.out.println(str + ":" + str.hashCode());

        String s1 = "abj";
        String s2 = "abj";
        System.out.println(s1 == s2);

        // Strings are immutable (unchange) by default in java

        // StringBuilder and StringBuffer provides ways for creating mutable string

        StringBuffer sb = new StringBuffer("Modi");
        System.out.println(sb.capacity());// 16(spaces extra) +4 (Modi)
        System.out.println(sb.length());// 4

        sb.append("JI");
        System.out.println(sb);// ModiJI

        //String s = sb.toString(); to convert to string
        sb.deleteCharAt(4);
        System.out.println(sb);//ModiI

        sb.insert(4, "JIII");
        System.out.println(sb);//ModiJIIII

        String modi=sb.substring(0, 4);
        System.out.println(modi);//Modi

        //String Buffer is Thread Safe

        //String Builder is not Thread Safe



    }
}
