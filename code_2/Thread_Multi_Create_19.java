import java.util.Scanner;

class Calc extends Thread{
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
class Message extends Thread{
    public void run(){ 
        System.out.println("An important message for you");
        try{
            for(int i=0;i<30;i++){
                System.out.println("FOCUS on your GOALS");
                Thread.sleep(2000); // 2 sec
            } 
        }
        catch(Exception e){
            System.out.println("Error occured : "+e.getMessage());
        }
    }
}
public abstract class Thread_Multi_Create_19 {
    public static void main(String[] args) {

        System.out.println("main thread");
        Calc t1=new Calc();
        Message t2=new Message();
        t1.start();
        t2.start();

        // t1.run();
        // t2.run();

        // agar hum run method ko direct call karte hai toh ye program single thread ki taraf kaam karega mtlb 
        // line by line execution hoga

        
    }
}
