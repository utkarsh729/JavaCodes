public class string13 {
    public static void main(String[] args) {
        String s1="Golu";
        String s2="Golu";
        String s3="golU";
        String s4=new String("Golu");
        String s5=new String("Golu");
    

        System.out.println(s1==s2);      // true // == compares the reference
        System.out.println(s1==s3);      // false
        System.out.println(s1==s4);       // false

        System.out.println(s1.equals(s2));      //true  // equals compare the content 
        System.out.println(s1.equals(s3));       // false
        System.out.println(s1.equals(s4));      // true

        System.out.println(s4==s5);  //false
        System.out.println(s4.equals(s5)); //true
        System.out.println(s3.equalsIgnoreCase(s5));  // true
        
    }
}
