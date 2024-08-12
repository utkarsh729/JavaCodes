
public class EXception_14 {
    public static void main(String[] args) {
        int num1=7;
        int num2=2;
        int result=0;
        int []arr={4,5,1,7};
        // String name=null;
        try{
            result=num1/num2;
            // result=num1/name.length();
            System.out.println(arr[3]);
        }
        catch(ArithmeticException e){
            System.out.println("Can't divide by zero " +e);
        }
        catch(ArrayIndexOutOfBoundsException obj){
            System.out.println("Be in your limits "+obj);
        }
        catch(Exception e){        // ye wala catch block last mai likhna hota hai ..kyuki ye saare exception ko handle kr 
            // sakta hai.. agar isko uper likh diya baaki ke catch block koi kaam ke nahi...program mai errro aayega
            System.out.println("Ohh NO!... something went wrong");
        }

        System.out.println(result);
        System.out.println("End of program ... Bye ");

    }
    
}
