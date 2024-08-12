import java.util.*;
import java.util.Map.*;

class student<T>{
    T n;
    public student(T n){
        this.n=n;
    }
    public T get(){
        return n;
    }
    
}
public class practice_1 {    public static void main(String[] args) {
       
        student<String> st1=new student<String>("Golu");
        student<Integer> st2=new student<Integer>(7);
        System.out.println(st1.get());
        System.out.println(st2.get());

        
    }
}
