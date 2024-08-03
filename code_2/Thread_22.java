class MyThread implements Runnable{
    public void run(){
        try{
            for(int i=0; i<3; i++){
                System.out.println("Focus is important");
                Thread.sleep(3000);
            }
        }
        catch(Exception e){
            System.out.println("Some error occured");
        }
    }
}
public class Thread_22 {
    public static void main(String[] args) throws Exception{

        System.out.println("Main thread started");

        MyThread mt=new MyThread();
        Thread t=new Thread(mt);

        System.out.println(t.isAlive());  //false

        t.start();
        System.out.println(t.isAlive());  // true.... thread ko life thread schedular ke pass jake milti hai
        t.join();  // phele t thread apna kaam khatam karega tabhi main thead chalega
        
        System.out.println("main thread ends");
        
    }
}
