// lambda expression only works with functional interface

interface Car{
    void drive();
}
interface Who{
    void age(int umar);
}
interface Speed{
    void velocity(int as, int ts);
}
public class lambda_expression_13 {
    public static void main(String[] args) {
        Car obj= () ->  System.out.println("Driving....");   // lambda expression with zero argument 
        obj.drive();
    
        Who w = a -> {   // lambda expression with one parameter
            System.out.println(" the age is "+a);
            if(a>18)
            System.out.println("You can drive"); 
            else
            System.out.println("You can't");
        };
        w.age(19);

        Speed s=(av,ts) -> {
            System.out.println(" the average speed is: "+av);
            System.out.println(" the top speed is: "+ts);
        };
        s.velocity(50, 70);
    }
}
