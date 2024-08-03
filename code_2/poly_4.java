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
public class poly_4{
    public static void main(String[] args) {
        CargoPlane c=new CargoPlane();
        PassengerPlane p=new PassengerPlane();
        Aeroplane a;
        // p=c error
    
        a=c;
        a.takeOff();
        a.fly();
        System.out.println("---------------------------------------------------");
        a=p;
        a.takeOff();
        a.fly();
        
        
    }
}