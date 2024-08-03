class Aeroplane{
    void takeOff(){
        System.out.println("Requires runway");
    }
    void fly(){
        System.out.println("it fly");
    }
}
class CargoPlane extends Aeroplane{
    void takeOff(){
        System.out.println("large runway");
    }
    void fly(){
        System.out.println("It fly at medium height");
    }
}
class PassengerPlane extends Aeroplane{
    void takeOff(){
        System.out.println("small runway");
    }
    void fly(){
        System.out.println("It fly in the cloud");
    }
}
class Airport{
    public void poly(Aeroplane ref){
        ref.takeOff();
        ref.fly();

        System.out.println("---------------------------------------------------------------------------------------");
    }
}
public class poly_5 {
    public static void main(String[] args) {
        // CargoPlane cp=new AeroPlane();  --> invalid
        // Aeroplane ap=new CargoPlane(); // valid
        // ap.takeOff();
        // ap.fly();

        System.out.println("-------------------------------------------------------------------------------------");

        Aeroplane ap=new Aeroplane();
        CargoPlane cp=new CargoPlane();
        PassengerPlane pp=new PassengerPlane();

        Airport apt=new Airport();

        apt.poly(ap);
        apt.poly(cp);
        apt.poly(pp);

    }
    
}
