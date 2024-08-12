import java.util.*;
class Employee{
    private String name;
    private int empId;
    
    public Employee(String name, int empId){
        this.name=name;
        this.empId=empId;
    }

    @Override
    public String toString(){
        return empId + " ";
    }

    @Override
    public void finalize(){
        System.out.println("Clean up work by garbage collector before de allocation memory from heap");
    }
    
}

public class Map_16 {
    public static void main(String []args){

        Employee emp=new Employee("Utkarsh", 137);
        // System.out.println(emp); // we have override the toString so ye object ka hashcode nahi dega..

        // HashMap hm=new HashMap();
        // hm.put(emp,"Utkarsh");
        // System.out.println(hm);

        WeakHashMap whm=new WeakHashMap();

        whm.put(emp,"Golu");

        System.out.println(whm);

        emp=null; // eligible for garbage collection

        System.gc(); // invoking garbage collector
        // internally gc call finalize() method
        // System.out.println(hm);  // hashmap dominates garbage collector..that is why it is not invoking

        System.out.println(whm);  // weakhashmap does not dominate the gc




        System.out.println("LastLine");

    }
}
