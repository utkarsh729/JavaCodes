import java.util.*;
import java.util.function.Consumer;
public class ForEach_3 {
    public static void main(String[] args) {
        
        // List<Integer> list1=new ArrayList<Integer>();
        // list1.add(3);
        // list1.add(10);
        // list1.add(7);
        // list1.add(4);
        // list1.add(19);
        // System.out.println(list1);

        //OR

        List<Integer> list2=Arrays.asList(3,10,7,4,19);
        System.out.println(list2);

        // for(Integer i: list2){   
        //     // You can also use..Object o:list2..but we have specified that we are working on integer data
        //     System.out.println(i);
        // }

        list2.forEach(n->System.out.println(n));  // lambda expression
        // forEach except karega ki aap consumer interface ki difination de..consumer interface ak functional interface hai

        // OR
        System.out.println("------------------------------------------------------");
        Consumer<Integer> cons=new Consumer<Integer>(){ // annoynemous inner class
            @Override
            public void accept(Integer i){
                System.out.println(i);
            }
        };
        
        list2.forEach(cons);

        //OR

        System.out.println("------------------------------------------------------");

        // Consumer<Integer> cons2=i->{
        //     System.out.println(i);
        // };
         
        Consumer<Integer> cons2=i->System.out.println(i); 
        list2.forEach(cons2);

         System.out.println();
        List l=Arrays.asList(3,true,4.22,"Golu");

        Consumer con=n->System.out.println(n);

        l.forEach(con);


    }
}
