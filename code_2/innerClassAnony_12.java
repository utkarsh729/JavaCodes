interface car{
    void drive();
}
public class innerClassAnony_12 {
    public static void main(String[] args) {
        car obj=new car()
        {   // inner anonymous class --> can only be used once 
            public void drive(){
                System.out.println("Driving");
            }
        };
        obj.drive();
    }
    
}
