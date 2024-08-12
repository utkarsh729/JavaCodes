
final class Animal{
    void sleep(){
        System.out.println("animal is sleeping");
    }
}

// class Tiger extends Animal{} --> final class can't be extended

class Animal2{
    final int age=7;
    final void sleep(){ // final methods participate in inheritance
        
        System.out.println("Animal is sleeping");

    }
}
class Tiger extends Animal2{
    // Tiger class can inherit the final methods but we can't override them in child class
    // void sleep(){} we cannot override the final method
    void umar(){
        // age=10; we can't change 
        System.out.println(age);
    }
}
public class final_7 {
    public static void main(String[] args) { 
        Tiger t=new Tiger();
        t.sleep();
        t.umar();
    }
    
}
