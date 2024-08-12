class Producer extends Thread{
    Intermediate obj;
    Producer(Intermediate obj){
        this.obj=obj;
    }
    public void run(){
        int i=1;
        for(int k=0;k<5;k++){
            obj.put(i++);
        }
    }  
}
class Intermediate{
    int x;
    boolean valueInX=false;
    synchronized void put(int j){
        try{
            if(valueInX==true){
                wait();
            }
            else{
                x=j;
                System.out.println("Have put the value in x: "+x);
                valueInX=true;
                notify();
            }
        }
        catch(Exception e){
            System.out.println("Kuch ghotala hai bhai");
        }
    }
    synchronized void get(){
        try{
            if(valueInX==false){
                wait();
            }
            else{
                System.out.println("Consumed the value of x : "+x);
                valueInX=false;
                notify();
            }
        }
        catch(Exception e){
            System.out.println("kuch ghotala hai ");
        }
    }
}
class Consumer extends Thread{
    Intermediate obj;
    Consumer(Intermediate obj){
        this.obj=obj;
    }
    public void run(){
        for(int k=0;k<5;k++){
            obj.get();
            
        }
    }
}
public class Thread_notify_25 {
    public static void main(String[] args) {
        Intermediate obj=new Intermediate();
        Producer p=new Producer(obj);
        Consumer c=new Consumer(obj);
        p.start();
        c.start();
    }
}
