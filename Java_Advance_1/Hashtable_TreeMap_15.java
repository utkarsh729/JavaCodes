import java.util.*;
public class Hashtable_TreeMap_15 {
    public static void main(String[] args) {
        Hashtable ht=new Hashtable();
        ht.put(2,"Rohan");
        ht.put(1,"utkarsh");
        // ht.put(null,"Golu");   give error as..null key and value are not allowed in hashtable
        // ht.put(3,null);
        ht.putIfAbsent(3,"Golu");
        ht.putIfAbsent(2,"Chutiya");  // will put if the key is absent(not prsent in hashtable)

        //order of insertion is not maintained in Hashtable

        System.out.println(ht);

        TreeMap tm=new TreeMap();
        int i=10;
        tm.put(3,"g");
        tm.put(4,"GOlu");
        tm.put(1,"Gul");
        tm.put(i,"FUck");
        tm.put(2,"Utkarsh");

        System.out.println(tm);

        // order of insertion is not maintained ..you get the data in ascending order

    }
}
