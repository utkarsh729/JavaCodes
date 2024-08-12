import java.util.*;
import java.util.stream.*;
import java.util.function.*;
public class Stream_5 {
    public static void main(String[] args) {
        List<Integer> l1=Arrays.asList(4,2,8,1,3);

        Stream<Integer> s1=l1.stream();
        
        // System.out.println(s1); will not print stream..hashcode print kr dega..kyuki humne toString method ko override nhi kiya
    
        Stream<Integer> sortedStream=s1.sorted();  // here s1 is used once..ye ak aur stream aa rahi uss pr hum work kr sakte hai

        // s1.forEach(i->System.out.println(i)); give exception as we already consume or operate once on the s1 stream

        Consumer<Integer> c=i->System.out.println(i);

        sortedStream.forEach(c);  

        System.out.println(" ---------------------------------------------------- ");

        System.out.println(l1);

        Stream<Integer> s2=l1.stream();

        Stream<Integer> sortedStream2=s2.sorted();

        Stream<Integer> ds2=sortedStream2.map(n->n*2);  // map mai functional interface ki body define krni hoti hai
        //here used lambda expression
        // map function se hum object ki value double ya unmai kuch bhi add,multiply etc kar sakte hai
        ds2.forEach(i->System.out.println(i));

        System.out.println(" ---------------------------------------------------------------- ");

        // ArrayList<Integer> al1=(ArrayList<Integer>) Arrays.asList(3,6,2,12,9,5); // list return karta hai isliye
        // ArrayList mai typecast kar diya

        List<Integer> l2=Arrays.asList(3,6,2,12,9,5);

        System.out.println(l2 instanceof List);  // return true 

        System.out.println(l2);

        Stream<Integer> s3=l2.stream();

        Predicate<Integer> p=new Predicate<Integer>(){
            @Override
            public boolean test(Integer i){
                if(i%2==0)
                    return true;
                else
                    return false;
            }

        };

        // Stream<Integer> fs=s3.filter(n->n%2==0); // filter the stream ..return the even number as new stream fs

        // Stream<Integer> sortfs=fs.sorted();  // sort the fs..and return the new stream

        // Stream<Integer> s4=sortfs.map(i->i+7);  // return the new stream by adding 7 to every integer in sortfs stream

        // OR

        // Stream<Integer> s5=s3.filter(n->n%2==0).sorted().map(n->n+7);   //chaining

        Stream<Integer> s5=s3.
        filter(p)      //chaining
        .sorted()
        .map(n->n+7);
        // agar retrun type same hai toh hum chaining kr sakte hai


        Consumer<Integer> c2=new Consumer<Integer>() {
            @Override
            public void accept(Integer i){
                System.out.println(i);
            }
        }; 
        
        // s4.forEach(c2);
        s5.forEach(c2);
       


        

        
    }
}
