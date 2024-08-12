class Example implements Runnable{
    public void run(){
        try{
            for(int i=0; i<3; i++){
                System.out.println("Focus ke le bhai");
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
public class Thread_interrupt_23 {
    public static void main(String[] args) {
        Example ex=new Example();
        Thread t=new Thread(ex);
        t.start();
        t.interrupt();  // thread tabhi interrupt hoga jab wo waiting/blocked state mai hoga
        
    }
    
}
