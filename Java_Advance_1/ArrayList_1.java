import java.util.*;

public class ArrayList_1{

    public static void main(String[] args) {
        ArrayList al1=new ArrayList();
        al1.add(7); // in all types of collection all the information is stored in form of object
        al1.add(56); // 56 is added after 7
        al1.add("Golu"); // we can add a mixed data also
        al1.add(7.4);
        al1.add(10%3);
        al1.add(true);

        System.out.println(al1);

        System.out.println("------------------------------------------------------------------");
        
        ArrayList al2=new ArrayList();
        al2.add(10);
        al2.add('X');
        System.out.println(al2);

        al2.add(al1);  //agar add use karke ak collection mai dusri collection jodenge toh collection ke andar collection add hogi
        System.out.println(al2);

        System.out.println("------------------------------------------------------------------");

        
        al2.addAll(al1); // aur agar addAll use karte hai toh collection ke anda dusri collection ke elements add honge 
        System.out.println(al2);

        ArrayList al3=new ArrayList();
        al3.add(6);
        al3.add("Golu");
        al3.add(5/2.0);
        al3.add(5/2);
        al3.add(5.0/2);
        al3.add(9+3);
        System.out.println(al3);
        al3.add(1,100);  // add 100 at index 1 ..we can add element using index also ..other element will be shifted
        System.out.println(al3);
        al3.addAll(4,al1);
        System.out.println(al3);


        // Points
        // order is preserved..jis order mai daaloge ussi order mai retrieve honge
        // duplicates are allowed..we can have same objects
        // mixed types of data can be stored
        // ak arrayList ko dusri mai add kr sakte hai
        // based on index we can store data.. but it is not highly recommened as every element is shifted so not efficient
        
    }
}
