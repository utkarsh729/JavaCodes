abstract class Aeroplane{
    abstract void takeOff();
    abstract void fly();
    public void landing(){
        System.out.println("plane is landing");
    }
    Aeroplane(){
        System.out.println("constructor of abstract class");
    }
}
class CargoPlane extends Aeroplane{
    void takeOff(){
        System.out.println("large runway");
    }
    void fly(){
        System.out.println("It fly at medium height");
    }
    void alert(){
        System.out.println("Alert....");
    }
}
class PassengerPlane extends Aeroplane{
    void takeOff(){
        System.out.println("small runway");
    }
    void fly(){
        System.out.println("It fly in the cloud");
    }
    public void landing(){
        System.out.println("passenplane is landing");
    }
}
public class abstration_6 {
    public static void main(String[] args) {
        // Aeroplane ref=new Aeroplane(); we cannot make object of Abstract class 
        Aeroplane ref=new CargoPlane();
        ref.takeOff();
        ref.fly();
        ref.landing();
        // ref.alert();  as ref can call only those method which are overridden or inheritated from parent class 
        // we can type cast it
        ((CargoPlane) ref).alert();

        System.out.println("--------------------------------------------------------------------------------------");

        ref=new PassengerPlane();
        ref.takeOff();
        ref.fly();
        ref.landing();
        
    }
    
}
