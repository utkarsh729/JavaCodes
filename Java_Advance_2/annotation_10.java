import java.lang.annotation.*;

// annotation that store information of another annotation are called meta annotation ..e.g Target, Retention   

@Target({ElementType.TYPE,ElementType.FIELD})     // setting target... means annotation kaha pr kaam karegei...
//....ya kaha kaha use kr sakte hai
@Retention(RetentionPolicy.RUNTIME)   // setting power of annotation
@interface CricketPlayer{   // making custom annotation

        String country() default "India";  // we can set default values...we can also give value 
        int age();  // if we are not setting default value then jab annotation mention karenge vaha value deni hogi
}

@CricketPlayer(age=34)
class Virat{

    @CricketPlayer(age=34)
    private int innings;
    @CricketPlayer(age=34)
    private int runs;
    
    public void setInnings(int innings){
        this.innings=innings;
    }
    public int getInnings(){
        return innings;
    }
    public void setRuns(int runs){
        this.runs=runs;
    }
    public int getRuns(){
        return runs;
    }
}


public class annotation_10 {
    public static void main(String[] args) {

        Virat v=new Virat();
        v.setInnings(200);
        v.setRuns(32938);

        System.out.println(v.getInnings());
        System.out.println(v.getRuns());

        Class c=v.getClass();      // getClass return the class...v.getClass return the class of object v

        Annotation a=c.getAnnotation(CricketPlayer.class);  // return the annotation

        CricketPlayer cp=(CricketPlayer)a;  // Downcast ..annotation type to CricketPlayer type

        String cnt=cp.country();
        System.out.println(cnt);

        System.out.println(cp.age());


        
    }
}
