class MyException extends Exception{
    MyException(){}
    MyException(String msg){
        super(msg);
    }
}
public class Exception_Custom_16 {
    public static void main(String[] args) {
        int num1=8;
        int num2=-2;
        int result;
        try {
            if(num2<0){
                // Exception e=new Exception();
                // Exception e=new ArithmeticException("Negative number");
                // Exception e=new MyException();
                Exception e=new MyException("Invalid Number");
                throw e;
            }
            else{
                result=num1/num2;
                System.out.println(result);
            }
        }
        catch(Exception e){
            System.out.println("Enter the valid number--> "+e);
        }
    }
}
