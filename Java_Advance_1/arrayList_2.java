import java.util.*;
public class arrayList_2 {
    public static void main(String[] args){
        ArrayList al1=new ArrayList();
        
        al1.add(100);    
        al1.add(200);    
        al1.add(300);  
        System.out.println(al1.contains(100));
        System.out.println(al1.indexOf(200));
        System.out.println(al1);  
        System.out.println(al1.contains(200));  // return boolean ..check whether the object is present in collection or not
        int ind=al1.indexOf(200);
        System.out.println(ind);
        System.out.println(al1.indexOf(400)); // return -1 if index is not found means object is not present
        System.out.println(al1.size());  // return the size of collection
        al1.remove(Integer.valueOf(200));
        System.out.println(al1);
        System.out.println("-------------------------");
        al1.ensureCapacity(5); // it reserves minimum space for you
        System.out.println(al1.size());
        al1.trimToSize();
        System.out.println(al1.size());
    
        al1.clear(); // will clear all the object from collection
        System.out.println(al1);

        List al=new ArrayList();
        // child type object ke liye parent type reference bana sakte hai...
        al.add(7);
        System.out.println();
        
    }
}
