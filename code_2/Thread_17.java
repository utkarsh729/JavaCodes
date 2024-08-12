public class Thread_17 {
    public static void main(String[] args) {
        System.out.println("Main thread");
        System.out.println("Before changing ");
        String name=Thread.currentThread().getName();      
        System.out.println("The name of main thread is: "+name);  // default thread name
        System.out.println("The priority of main thread is: "+Thread.currentThread().getPriority()); // default priority

        System.out.println("After changing");
        Thread t=Thread.currentThread();
        t.setName("Golu");
        t.setPriority(7);
        System.out.println("The name of main thread is: "+t.getName());
        System.out.println("The priority of main thread is: "+Thread.currentThread().getPriority());

        
    }
}
