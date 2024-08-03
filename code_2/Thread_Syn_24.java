class Car implements Runnable{
    //  synchronized public void run()
    public void run() {  // with using synchronized keyword one thread at a time can access the resource
        try{
            System.out.println(Thread.currentThread().getName()+"  Has entered the parking lot");
            Thread.sleep(2000);
            synchronized(this){
            System.out.println(Thread.currentThread().getName()+"  Got into the car");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+"  Driving the car");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+"  Came back and parked the car");
            }
        }
        catch(Exception e){
            System.out.println("Some error occured");
        }
    }
}
public class Thread_Syn_24 {
    public static void main(String[] args) throws Exception{
        System.out.println("Main thread started");
        Car c=new Car();
        
        Thread t1=new Thread(c);
        Thread t2=new Thread(c);
        Thread t3=new Thread(c);

        t1.setName("SON-1");
        t2.setName("SON-2");
        t3.setName("SON-3");

        t1.start();
        // t1.join();  --> t1 will start and finish his task then t2 will start
        t2.start();
        // t2.join();  --> t2 will start and finish his task then t2 will start
        t3.start();
        // t3.join();  --> t2 will start and finish his task then next thread will run

        System.out.println("Main thread ends");
        
    }
}
