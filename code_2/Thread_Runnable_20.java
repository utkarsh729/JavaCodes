import java.util.Scanner;

class Calc implements Runnable{
    public void run(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2=sc.nextInt();
        int result=num1+num2;
        System.out.println(result);
        sc.close(); 
    }
}
class Message implements Runnable{
    public void run(){ 
        System.out.println("An important message for you");
        try{
            for(int i=0;i<3;i++){
                System.out.println("FOCUS on your GOALS");
                Thread.sleep(2000); // 2 sec
            } 
        }
        catch(Exception e){
            System.out.println("Error occured : "+e.getMessage());
        }
    }
}
public class Thread_Runnable_20 {
    public static void main(String[] args) {
        System.out.println("main thread start ");
        Calc c1=new Calc();
        Message m1=new Message();
         
        Thread t1=new Thread(c1);
        Thread t2=new Thread(m1);

        t1.start();
        t2.start();
        
        System.out.println("main thread ends");
    }
    
}
