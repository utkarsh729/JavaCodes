import java.util.*;
public class ArrayDeque_5 {
    public static void main(String[] args) {
        // deque internally follows the double ended queue
        ArrayDeque ad1=new ArrayDeque();
        ad1.add(100);
        ad1.add(200);
        ad1.add(300);
        // ad1.add(1,400);   --> give error as error index based accessing is not allowed in ArrayDeque

        System.out.println(ad1);

        ad1.addFirst(1);
        ad1.addLast(99);
        
        System.out.println(ad1);

        ad1.offer("MY");     // offer  is same as add
        ad1.offerFirst("MINE");  //offerFirst is same as addFirst
        ad1.offerLast("MERI");  // offerLast is same as addLast

        // the only difference is that their is high chance of data is not added to collection ..like we are offering the data
        // their is possibility that data is rejected 

        System.out.println(ad1);
    }
}
