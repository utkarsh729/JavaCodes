import java.util.*;
public class LinkedHashSet_9 {
    public static void main(String[] args) {
        LinkedHashSet lhs=new LinkedHashSet();
        
        lhs.add(45);
        lhs.add(7);
        lhs.add(90);
        lhs.add(1);
        lhs.add(7); // will discard duplicates...duplicates value is not allowed
        // lhs.add(2,100);  //--> index based accesssing is not allowed 

        System.out.println(lhs);

        // The differnce between LinkedHashSet and HashSet is that in LinkedHashSet order of insertion is preserved
        
    }
}
