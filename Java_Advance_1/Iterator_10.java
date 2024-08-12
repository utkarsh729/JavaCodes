import java.util.*;
public class Iterator_10 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(10);
        al.add(20);
        al.add(7);
        al.add(90);

        System.out.println(al);

        // for loop
        for(int i=0;i<al.size();i++){
            // Object o=al.get(i); // as al.get return object type data
            // System.out.println(o);
            // OR
            System.out.println(al.get(i));
        }
        System.out.println(" --------------------------- ");
        // for each
        for(Object o: al){
            System.out.println(o);
        }
        
        
        // it is not recommened to use for loop in collection for iterating
        
        System.out.println(" --------------------------- ");
        Iterator itr=al.iterator();
        
        while(itr.hasNext()){
            // Object o=itr.next();
            // System.out.println(o);

            // OR 
            
            int n= (Integer)itr.next();  // as itr.next() return object data type to we have tp typecast it integer
            System.out.println(n);

            // OR

            System.out.println(itr.next());
        }

        System.out.println(" --------------------------- ");
        // ListIterator litr=al.listIterator(2);
        ListIterator litr=al.listIterator(al.size());  
        // using ListIterator we can travel in reverse direction also based on index value given
        while(litr.hasPrevious()){
            // System.out.println(litr.hasPrevious()); 
            System.out.println(litr.previous());
        }
        System.out.println();
        ListIterator lity=al.listIterator(0);
        while(lity.hasNext()){
            System.out.println(lity.next());
        }


        // ListIterator is only present in List based classes ...ArrayList and LinkedList



    }
}
