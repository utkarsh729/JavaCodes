
class Library implements Runnable{
    String res1="JAVA";
    String res2="SQL";
    String res3="DSA";

    public void run(){
        String name=Thread.currentThread().getName();
        if(name.equals("Student 1")){
            try{
                Thread.sleep(3000);
                synchronized(res1){
                    System.out.println("Student 1 has accuried "+res1);
                    Thread.sleep(3000);
                    synchronized(res2){
                        System.out.println("Student 1 has accuried "+res2);
                        Thread.sleep(3000);
                        synchronized(res3){
                            System.out.println("Student 1 has accuried "+res3);
                            Thread.sleep(3000);
                        }
                    }

                }
                
            }
            catch(Exception e){
                System.out.println("Some error occured");
            }
        }
        else{
            try{
                Thread.sleep(3000);
                synchronized(res3){
                    System.out.println("Student 2 has accuried "+res3);
                    Thread.sleep(3000);
                    synchronized(res2){
                        System.out.println("Student 2 has accuried "+res2);
                        Thread.sleep(3000);
                        synchronized(res1){
                            System.out.println("Student 2 has accuried "+res1);
                            Thread.sleep(3000);
                        }
                    }
    
                }
                
            }
            catch(Exception e){
                System.out.println("Some error occured");
            }
        }
    }

}
public class Thread_Deadlock_25 {
    public static void main(String[] args) {
        Library lib=new Library();

        Thread t1=new Thread(lib);
        Thread t2=new Thread(lib);

        t1.setName("Student 1");
        t2.setName("Student 2");

        t1.start();
        t2.start();

    
    }
    
}
