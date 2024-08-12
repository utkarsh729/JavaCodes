// CONSTRUCTOR OVERLOADING and this()
class Student{
    private String name;
    private int age;
    Student(){
        System.out.println("default constructor");
        name="Golu";
        age=19;
    }
    Student(String name){
        this("guddu",7);
        System.out.println("constructor with 1 parameter");
        this.name=name;
        age=20;
    }
    Student(String name, int age){
        this();
        System.out.println("constructor with 2 parameter");
        this.name=name;
        this.age=age;
    }
    void disp(){
        
        System.out.println(name);
        System.out.println(age);
    }
}
public class constructor27 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.disp();
        Student s2=new Student("utkarsh");
        s2.disp();
        Student s3=new Student("ekaa", 18);
        s3.disp();
        
    }
}
