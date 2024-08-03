public class oops6 {
    int a; // instance variable
    String name;  // instance variable
    public static void main(String[] args) {
        int num=6; // primitive variable or local variable
        // local variable must be initialised before use
        System.out.println(num);
        oops6 obj=new oops6(); // reference variable    
        System.out.println(obj.a);
        System.out.println(obj.name);
        
    }
}
