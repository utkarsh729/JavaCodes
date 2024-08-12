import java.util.*;
import java.util.stream.*;
public class Stream_4 {
    public static void main(String[] args) {

        List<Integer> list1=Arrays.asList(2,3,6,8,1);

        // hum integer object ki collection ki ak stream bana lenge aur uss pr kaam karenge jisse hamara actual data na affect ho
        
        Stream<Integer> s1= list1.stream();

        s1.forEach(n->System.out.println(n));

        // hum ak stream pr ak baar he kaam kr sakte hai ..mtlb ak baar consume kr liya toh dubara stream ko use nahi kr sakte


        // s1.forEach(n->System.out.println(n)); 
        // give exception as s1 stream is already consumed

        long cnt=s1.count();  // return total number of object present in stream
        // here it will give exception ..kyuki hum ak stream pr ak operation he perform kr sakte hai
        System.out.println(cnt);
        
    }
}
