// CONCATINATION OF TWO STRINGS
public class string14 {
    public static void main(String[] args) {
        String s1=new String("Padhai");
        s1.concat(" karo");
        System.out.println(s1);  // Padhai... as s1 is referencing to Padhai
        s1=s1.concat(" karo");  // here s1 is referencing to padhai karo..but keep in mind string not changed reference is changed
        System.out.println(s1);

        String str1="Golu";
        String str2=str1.concat("Jumbo");
        String str3=new String("Gul");
        str3=str3.concat("Kuhu");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        String a1="abc";
        String a2="cd"+"ef" +" xyz  ";  // eg
        String a3=a1+a2;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        // with + we can concate more then one string.. look eg
        
        String b1="golu"+7+'%';  
        System.out.println(b1);
        // with + we can concate interger character in string and final result will be string

        // String c1="golu";
        // c1=c1.concat(7);  // give error as we can't concate number with concate()

    }

}
