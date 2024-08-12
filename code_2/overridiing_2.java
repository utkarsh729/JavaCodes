class Animal{
    void eat(){
        System.out.println("All animal eats");
    }   
}
class Tiger extends Animal{
    // while overriding you 
    // int age(){}  --> change return type of method
    // private void eat(){} --> you cannot decrease the visibility
    protected void eat(){  // --> you can increase the visibility
        System.out.println("Tiger hunts and eat");
    }
    void eat(String food){  // --> this is function overloading
        System.out.println("food is :"+food);
    }
    // private void say(){
    //     System.out.println("khaunga");
    // }
}
public class overridiing_2 {
    public static void main(String[] args) {
        
        Tiger g=new Tiger();
        g.eat();
        g.eat("BAlu");
    
    }

}
