import java.util.Arrays;

// to check ANAGRAM
public class string17 {
    public static void main(String[] args) {
        // String str1="School master";
        // String str2="The Classroom";

        String str1="keep";
        String str2="petek";
    
        // step 1--> remove white spaces
        str1=str1.replace(" ","");
        str2=str2.replace(" ","");

        // step 2 --> convert to lowercase or uppercase
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        // step 3 --> convert it into character array
        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();

        // step 4 --> sort the array
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        // step 5 --> compare both arrays
        if(Arrays.equals(ch1,ch2))
        System.out.println("it is anagram");
        else
        System.out.println("not");
        
    }
}
