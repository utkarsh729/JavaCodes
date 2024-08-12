
public class string_mutable21 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder(); // creates empty string with capacity of 16 letter
        System.out.println(sb.capacity());  // 
        sb.append("He");
        System.out.println(sb);
        System.out.println(sb.capacity());

        sb.append("abcdefghihjksa");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("xoxo");
        System.out.println(sb.length());  // how many character are present 
        System.out.println(sb.capacity()); // how many total character can hold

        StringBuilder str2=new StringBuilder("Golu");
        // if we give string in during creation then its capacity increase from 16 to 16+string.length()
        System.out.println(str2.capacity()); //20

        System.out.println("\n--------------------------------------------------------------------\n");

        StringBuffer str3=new StringBuffer("KamaSutra");
        System.out.println(str3.charAt(2));
        str3.setCharAt(4, 'P');  // replace character at index 4 with P
        System.out.println(str3);


        StringBuffer str4=new StringBuffer(70); // capacity is 70
        System.out.println(str4.capacity());
        str4.append("love");
        str4.trimToSize(); //removes extra capacity
        System.out.println(str4.capacity());
        System.out.println(str4.reverse()); // reverses  the string       
          
    }
    
}
