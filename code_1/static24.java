
class Demo{
    static int a;
    static int b;

    int m;
    int n;
    
    static{
        a=10;
        b=20;
        System.out.println("Inside static block");
    }
    static void disp1(){
        System.out.println("The value of static variable a is: "+a);
        System.out.println("The value of static variable b is: "+b);
    }
    
    {
        m=24;
        n=79;
        System.out.println("Control inside non static variable or initialization block");
    }
    
    void disp2(){
        System.out.println("value of instance variable m is: "+m);
        System.out.println("value of instance variable n is: "+n);
    }
}
public class static24 {

    static{
        System.out.println("main class static block");
    }
    public static void main(String[] args) {
        System.out.println("in main");
        Demo d = new Demo();
        Demo.disp1();
        d.disp2();
        
    }
}
