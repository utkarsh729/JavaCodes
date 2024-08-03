interface Computer{
    void compileCode();
}
class Laptop implements Computer{
    public void compileCode(){
        System.out.println("Slow...........");
        System.out.println("You got 5 error");
    }
}
class Desktop implements Computer{
    public void compileCode(){
        System.out.println("FAST.......");
        System.out.println("You got 5 error");
    }
}
class Developer{
    void buildApp(Computer obj){
        System.out.println("Building app");
        obj.compileCode();
    }
}
public class interface_9 {
    public static void main(String[] args) {
        Developer d=new Developer();
        Desktop dt=new Desktop();
        d.buildApp(dt);
        Laptop lp=new Laptop();
        d.buildApp(lp);
    }
}
