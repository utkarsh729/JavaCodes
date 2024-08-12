import java.util.*;
public class LinkedList_3 {
    public static void main(String[] args) {
        
        LinkedList ll1=new LinkedList();

        ll1.add(100);
        ll1.add("golu");
        ll1.add(3.2);

        System.out.println(ll1);

        // jo function array list mai same linkedList mai bhi honge
        // linkedlist dequeue method ko bhi implement karta hai ..toh uske bhi method honge
        // internally or behind the scene linkedlist uses specific data structure called linkedList

        // some extra method in linkedlist

        ll1.addFirst("gg");
        ll1.addLast(9);

        System.out.println(ll1);

        ll1.add(2,5); // yaha shifting nahi hoti..data node mai store hota hai..node is connected to another node

        System.out.println(ll1.peek()); // return the first object from linkedlist and it does not affect the list
        System.out.println(ll1);

        System.out.println(ll1.poll()); // return the first object from linkedlist and remove the first element form linkedlist
        System.out.println(ll1);

    }

}
