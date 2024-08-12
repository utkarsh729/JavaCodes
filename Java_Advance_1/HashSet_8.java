import java.util.*;
public class HashSet_8 {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        
        hs.add(45);
        hs.add(null);
        hs.add(7);
        hs.add(90);
        hs.add("uu");
        hs.add(7); // will discard duplicates...duplicates value is not allowed
        // hs.add(2,100);  --> index based accesssing is not allowed 

        System.out.println(hs);

        // order of insertion is not preserved
        // behind the scene HashSet follows the Hash data structure
    }
}
