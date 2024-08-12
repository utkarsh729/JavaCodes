import java.util.*;
class Gen<T>{
    T obj;
    public Gen(T obj){
        this.obj=obj;
    }
    public void display(){
        System.out.println("The type of data is: "+obj.getClass().getName());
    }
    public T getObj(){
        return obj;
    }
}
public class Generics_19 {
    public static void main(String[] args) {

        // ArrayList<String> list1=new ArrayList<String>();  valid

        // List<String> list2=new ArrayList<String>();     valid

        // Collection<Integer> list3=new ArrayList<Integer>();    valid

        // List<Object> list4 =new ArrayList<Integer>();  invalid
        // List<Integer> list5 =new ArryaList<String>();  invalid
        // List<int> list6=new List<int>(); invalid

        Gen<Integer> g1=new Gen<Integer>(7);

        g1.display();
        System.out.println(g1.getObj());

        Gen<String> g2=new Gen<String>("Utkarsh");
        g2.display();
        System.out.println(g2.getObj());
    }
}
