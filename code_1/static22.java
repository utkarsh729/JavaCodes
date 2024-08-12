public class static22 {
    static int a;
    
    static{
        // a=10;
        System.out.println("static block");
        System.out.println(a);
    }

    static void display(){
        System.out.println("static method 2");
    }
    public static void main(String[] args) {
        System.out.println("main method");
        display();
    }

    // static variable then static block then main method is executed
    // static variable and static block executed automatically without calling
    // main method is called by JVM itself...and we have call other static method for executing 
    
}
