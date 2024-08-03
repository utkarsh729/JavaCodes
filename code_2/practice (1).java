import java.util.Scanner;

interface A{
    void show();
}
interface B{
    void show();
}
class C implements A, B{
    public void show(){
        System.out.println("Hello");
    }
    
}
public class practice {
    static public void main(String []args){
        A aobj=new C();
        aobj.show();
        B bobj=new C();
        bobj.show();
        C obj=new C();
        obj.show();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        sc.close();
        Scanner o=new Scanner(System.in);
        int n=o.nextInt();
        System.out.println(num);
        System.out.println(n);
        o.close();
        


    }
    
}
