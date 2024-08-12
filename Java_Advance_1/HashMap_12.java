import java.util.*;
public class HashMap_12 {
    public static void main(String[] args) {
        HashMap hm1=new HashMap();
        
        hm1.put(1,"Golu");
        hm1.put(01,"Utkarsh");  // will discard the previous entry ...key must be unique...

        hm1.put(2,9.8);
        hm1.put("Ekaa","Gul");
        hm1.put(null, "ROhan");  // only one null key is allowed ..key can't be same for two values..
        hm1.put(null,null);   // will discard as the previous null key and value
        hm1.put(12,true);
        hm1.put(true,"Love");   
        // we can

        System.out.println(hm1);

        // order of inserton is not preserved in HashMap

        // TO RETAIN ORDER OF INSERTION USE LinkedHashMap 

        LinkedHashMap lhm1=new LinkedHashMap();
        
        lhm1.put(1,"Golu");
        lhm1.put(01,"Utkarsh");  // will discard the previous entry ...key must be unique...
        lhm1.put(2,9.8);
        lhm1.put("Ekaa","Gul");
        lhm1.put(null,null);   // null key and value is allowed
        lhm1.put(null, "ROhan");  // only one null key is allowed ..key can't be same for two values..
        lhm1.put(12,true);
        lhm1.put(true,"Love");  

        System.out.println(lhm1);
    }
}
