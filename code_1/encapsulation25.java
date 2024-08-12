class Student{
    int age;
    String name;
    void setAge(int age){
        // age=age;  --> shadowing problem
        this.age=age;
    }
    void setName(String name){
        this.name=name;
    }
    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }
}
public class encapsulation25 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setAge(23);
        s1.setName("huhu");
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        Student s2=new Student();
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
    }
    
}
