
import java.util.*;

class Student implements Comparable<Student>{
    int marks;
    int age;
    String name;

    Student(int marks, int age, String name){
        this.marks=marks;
        this.name=name;
        this.age=age;
    }

    public String toString(){
        return marks+" - "+age+" - "+name;
    }
    @Override
    public int compareTo(Student st){
        if(this.age>st.age){
            return 1;
        }
        else{
            return -1;
        }
    }
}

public class Comparable_22 {
    public static void main(String[] args) {
        
        Student st1=new Student(34,12,"Ramesh");
        Student st2=new Student(78,20,"Yoga");
        Student st3=new Student(45,13,"Guddu");

        List<Student> l=new ArrayList<Student>();
        l.add(st1);
        l.add(st2);
        l.add(st3);

        System.out.println(l);
        System.out.println();
        
        Collections.sort(l);   // yaha error nahi aayega...internally sort is calling compareTo method

        System.out.println(l);
        
    }
}
