
// comment compile ignore kr deta hai...agar humko compiler (jvm) ko information deni ho toh hum annotation use karte hai



@FunctionalInterface
interface cycle{
    void tyre();
    // void company(); -->compiler give error as we have said it is funtional interface so it can have only one abstract function
}

@Deprecated //ab jab iss class ka object banaayege toh vaha bataya deprecated
class Plane{
    void fly(){
        System.out.println("High");
    }
}
class CargoPlane extends Plane{

    @Override    // agar hum galat function ka naam likhte hai toh compiler bta dega
    // void Fly(){}
    void fly(){
        System.out.println("Lower");
    }
}
public class annotation_9 {
   public static void main(String[] args) {
        Plane P=new Plane();
        P.fly();
        Plane pc=new CargoPlane();
        pc.fly();

   } 
}
