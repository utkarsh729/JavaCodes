// Multithreading using single run() method
import java.util.Scanner;

class MyThread extends Thread{
    public void run(){
        String tn=Thread.currentThread().getName();
        if(tn=="CALC"){
            calc();
        }
        else{
            msg();
        }
    }
    public void calc(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2=sc.nextInt();
        int result=num1+num2;
        System.out.println(result);
        sc.close(); 
    }
    public void msg(){
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
public class Thread_21 {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
         
        t1.setName("CALC");
        t2.setName("MSG");

        t1.start();
        t2.start();
        
    }   
}
