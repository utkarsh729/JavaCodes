import java.util.*;
class student{
    private String name;
    private int id;
    
    public String toString(){
        return "name is: "+name+"id is: "+id;
    }
}
class employee{
    private String name;
    private int id;
}
public class Generics_18 {
    public static void main(String[] args) {
        student s1=new student();
        student s2=new student();
        
        employee e =new employee();

        ArrayList<student> al1=new ArrayList<student>();
        // here we have ensured that we are working with only student data type

        al1.add(s1);
        al1.add(s2);

        System.out.println(al1);

        // al1.add(e); CE ..only student
    }
}
