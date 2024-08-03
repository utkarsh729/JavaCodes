class Demo1{
    int a,b;
    public Demo1(){
        System.out.println("parent class constructor");
    }
    public Demo1(int a,int b){
        this();
        System.out.println("parent class parameterized constructor");
        this.a=a;
        this.b=b;
        System.out.println(a+b);
    }
}
class Demo2 extends Demo1{
    int x;
    int y;
    public Demo2(){
        // super() --> by default it is included...if you are not including any super() with parameter and this()
        this(1,2);
        System.out.println("child class constructor");
    }
    public Demo2(int x,int y){
        // super() --> by default it is included...if you are not including any any super() with parameter and this()
        super(10,13);
        System.out.println("child class parameterized constructor");
        this.x=x;
        this.y=y;
        System.out.println(x+y); 
    }
}
public class constructor_inht_3 {
    public static void main(String[] args) {
        // Demo2 d1=new Demo2();
        // Demo2 d2 =new Demo2(3,4);
    
    }
}
