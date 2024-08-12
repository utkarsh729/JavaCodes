interface A{
    int num=7;    // by default interface variable are public, static and final
    void show();  // by default interface methods are public and static
    // A(){
    //     System.out.println("Interface ka constructor");  --> we can't create the constructor of interface
    // }
}
interface B{
  void abc();
}
interface C extends A{
  void name();
}
class D implements B,C{
  public void show(){
      System.out.println("interface A");
  }
  public void abc(){
      System.out.println("in abc");
  }
  public void name(){
    System.out.println("Golu");
  }
  public void hello(){
    System.out.println("hello");
  }
}
public class interface_8 {
  public static void main(String[] args) {
    System.out.println(A.num);  // as num is static so we can call it by using interface name
    // A.num=10; --> as num is final we can't change
    // A obj=new A();  --> can't create object of interface

    A obj=new D();
    obj.show();
    // obj.name(); --> as name present in interface C
    // obj.abc(); --> as abc present in interface B.. and obj is refer to only A 
    // obj.hello();  --> obj sirf unhi method ko call kr sakta hai jo interface A mai hai
    
    C cobj=new D();
    cobj.show();
    cobj.name();
    // cobj.hello();
    // cobj.abc(); error

    D dobj=new D();
    dobj.show();
    dobj.name();
    dobj.abc();
    dobj.hello();


  }  
}
