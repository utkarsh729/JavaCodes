class Add{
    // static int a;
    // static int b;

    // static{      // static block is executed first before default constructor or parametrised constructor
    //     a=10;
    //     b=20;
    //     System.out.println("Inside static block");
    // }

    private int a;
    private int b;
    Add(){
        System.out.println("constructor with no parameter");
    }
    Add(int a, int b){
        this.a =a;
        this.b=b;
        System.out.println("parameterized constructor");
    }
    void display(){
        System.out.println(a+b);
    }
    
    

}
public class constructor26 {
    public static void main(String[] args) {
        Add a=new Add();
        a.display();
        Add a2=new Add(3,4);
        a2.display();        
    }
    
}
