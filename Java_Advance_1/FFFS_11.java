import java.util.*;
import java.util.concurrent.*;
public class FFFS_11 {
    public static void main(String[] args) {
        // FailFast and FailSafe

        ArrayList al=new ArrayList();
        al.add(10);
        al.add(20);
        al.add(7);
        al.add(90);

        System.out.println(al);

        // for loop
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
            // al.add(100);
            // it will result into infinite loop...as in for loop we can modify data while accessing
        }

        Iterator itr=al.iterator();
         
        // fail fast
        while(itr.hasNext()){
            System.out.println(itr.next());
            // al.add(100); --> will give exception..as it does not allow modifying collection while accessing 
            // concurrent modification fails but fast(leading to exception )....this is called FailFast
        }


        CopyOnWriteArrayList al2=new CopyOnWriteArrayList();
        al2.add(10);
        al2.add(20);
        al2.add(7);
        al2.add(90);

        System.out.println(al2);

        Iterator itr2=al2.iterator();

        while(itr2.hasNext()){
            System.out.println(itr2.next());
            al2.add(100);  // will not raise exception but also not modify data during concurrent modification
            // concurrentent modification fails but safely ..program is executed..this is called FailSafe
        }


    }
}
