import java.util.*;
public class LinkedList_4 {
    public static void main(String[] args) {
        List ll1=new LinkedList();
        // child type object ke liye parent type reference bana sakte hai..but hum vahi function use kr payenge 
        // jo inherit juay hai linkedlist mai ya jo list mai present hai
        ll1.add(100);
        ll1.add("golu");
        ll1.add(3.2);
        // ll1.addFirst(99);   --> give error as addFirst is not present in List

        System.out.println(ll1);

        Deque dl=new LinkedList();
        dl.add(1);
        dl.add(2);
        // dl.add(1,100); --> give error as add(index,object) is not present in Deque
        System.out.println(dl);

        System.out.println(" ------------------------------------------------- ");

        LinkedList ll2=new LinkedList();

        ll2.add(100);
        ll2.add("Golu");
        ll2.add(6.9);
        ll2.add(89);
        ll2.add(100);
        ll2.add("golu");
        ll2.add(1); 

        System.out.println(ll2);

        System.out.println(ll2.get(1)); // return the object present at index 1
        System.out.println(ll2.indexOf("Golu")); // return the index of object
        System.out.println(ll2.lastIndexOf(100));
        System.out.println(ll2.indexOf(4));  // return -1 if object is not present in LinkedList
        System.out.println(ll2.getFirst());  // return first object from the list
        System.out.println(ll2.getLast());   // return last object from the list
        ll2.push(69); // will insert the object '69' at first
        System.out.println(ll2);
        System.out.println(ll2.pop()); // remove the first object form from list and will return that object
        System.out.println(ll2);
    }
    
}
