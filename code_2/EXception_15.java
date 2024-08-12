import java.util.InputMismatchException;
import java.util.Scanner;
public class EXception_15 {
    public static void main(String[] args) {
        int num=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number: ");
        try{
            num=sc.nextInt();
        }
        catch(InputMismatchException obj){
            System.out.println("only number are allowed");
        }
        finally{   // finally block is not mandatory 
            sc.close();
            System.out.println("Resourced closed");
        }
        // we can use either of finally and catch block with try block ...but it is complusory to have one of them with try
        System.out.println(num);

        int n=0;
        // try with resource ... it automatically close the resource ..no need to write the finally block ... 
        // but is does not catch the exception
        try(Scanner inp=new Scanner(System.in)){
            n=inp.nextInt();
        }
        // catch{
            // catch block does not work with try with resource block
        // }
        
        System.out.println(n);
        System.out.println("End of program");

    }
    
}
