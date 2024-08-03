class display{
    static void disp1(){
        System.out.println(" static method inside class display");
    }
    void disp2(){
        System.out.println("non static method");
    }
}
public class static23 {
    public static void main(String[] args) {
        display.disp1();
        // display.disp2(); --> give error as non static method can't be called directly

        display d=new display();
        // d.disp1();  --> can be called with object also
        d.disp2();
        
    }
    
}
