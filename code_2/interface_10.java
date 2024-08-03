//  java 8 onwards we can define method body in interface also
interface A{
    void show();
    default void say(){
        System.out.println("In default");
    }
    static void hello(){
        System.out.println("In hello");
    }
}
class B implements A{
    public void show(){
        System.out.println("In show");
    }
    // void hello(){
    //     System.out.println("hello in B");
    // }
    // public void say(){
    //     System.out.println("Defalut in B");
    // }

    // we can ALSO override default and static method of interface
}
public class interface_10 {
    public static void main(String[] args) {
        A.hello();
        // A.say(); --> error as say is non static method

        A obj=new B();
        obj.show();
        // obj.hello(); --> as hello is static can be only called A.hello
        obj.say();
    }
}
