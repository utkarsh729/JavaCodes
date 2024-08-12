import java.util.*;
public class Collections_methods_20 {
    public static void main(String[] args) {
        ArrayList al1=new ArrayList();
        al1.add(10);
        al1.add(24);
        al1.add(3);
        al1.add(16);
        al1.add(7);

        System.out.println(al1);

        Collections.sort(al1);
         
        System.out.println(al1);


        ArrayList al2=new ArrayList();
        al2.add("Golu");
        al2.add("akash");
        al2.add("aamar");
        al2.add("Bunny");
        al2.add("Ind");

        System.out.println(al2);

        Collections.sort(al2);
         
        System.out.println(al2);

        ArrayList al3=new ArrayList();
        al3.add(10);
        al3.add(20);
        al3.add(30);
        al3.add(40);
        al3.add(50);
        al3.add(40);

        int index=Collections.binarySearch(al3,30);  // check whether 30 is present in collection or not
        //  it return index if object found otherwise will return negative value
        // for binary search data must be sorted
        System.out.println(index);

        index=Collections.binarySearch(al3, 5);
        System.out.println(index);

        Collections.rotate(al3,3);  // last ke 3 number aage aa jayenge
        System.out.println(al3);

        Collections.shuffle(al3); // shuffle collection randomly
        System.out.println(al3);

        System.out.println(Collections.frequency(al3,20));
        System.out.println(Collections.frequency(al3,40));
    }
}
