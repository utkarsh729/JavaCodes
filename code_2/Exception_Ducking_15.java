class Demo{
    public void a() throws Exception{
        System.out.println("Inside a");
        b();
    }
    public void b() throws Exception{
        System.out.println("Inside b");
        int num1=7;
        int num2=0;
        int result=0;
        result=num1/num2;
        System.out.println(result);
    }
}

public class Exception_Ducking_15 {
    public static void main(String[] args) {
        Demo obj=new Demo();
        try{
            obj.a();
        }
        catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
    }
}
