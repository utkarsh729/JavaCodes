class Human { // extends Object  --> behind the scene if class is not extending any class then it will extend Object class
    private String name="Golu";
    int age;
    Human(){
        System.out.println("human class constructor");
        System.out.println("name is: "+name);
    }
    void sleep(){
        age=18;
        System.out.println("take sleep");
    }
}

class Student extends Human{  // human is parent class 

//    private member and constructor are not inheritated
//    parent class constructor is not inheritated in child class while extending ....but we call parent class constructor 
//    using super() method

    // Student(){
    //     super();   behind the scene this is happening whenever we create object of student class
    // }
    void disp(){
        System.out.println("The age is "+age);
        // System.out.println("The name is: "+name); --> can't access name as it is private member
    }
}

public class inheritance_1 {
    public static void main(String[] args) {
        Student st=new Student();
        st.sleep();
        st.disp();
        
    }
}
