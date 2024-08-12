import java.util.*;
import java.util.Map.*;
class Student{   // agar class kisi bhi class ko inherit nahi kr rahi toh vo by default object class ko inherit karti hai
    private String name;
    private int age;
    private String city;
    Student(String name, int age, String city){
        this.name=name;
        this.age=age;
        this.city=city;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getCity() {
        return city;
    }
    public String toString(){
        return name + " " + age + " " +  city;
    }

}
public class Map_14 {
    public static void main(String[] args) {
        Student st1=new Student("Golu",21,"Lucknow");
        Student st2=new Student("Gul",20,"Patna");
        Student st3=new Student("Neha",19,"Hissar");

        Map m1=new HashMap();
        m1.put(1,st1);
        m1.put(2,st2);
        m1.put(3,st3);
        
        // Before overriding toString()
        // System.out.println(m1);  --> sout internally call toString...here it will print object ka address ka hashcode

        // After overriding toString()
        System.out.println(m1);

        Set es=m1.entrySet();
        
        Iterator itr=es.iterator();

        while(itr.hasNext()){
            Entry e=(Entry)itr.next();
            System.out.println(e.getKey()+" : "+e.getValue());
        }

    }
}
