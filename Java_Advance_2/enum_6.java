enum Week{

    MON, TUE, WED, THU, FRI, SAT, SUN;

    // we don't use any keyword like public, static,final
    // eg MON ye variable ,yahi constant hai , yahi value, sab kuch yahi hai
    // we can use lowercase also but it is convention to use uppercase
}

// agar set values ko constant rakhna hai toh enum ka concept use karte hai
// e.g days in week ,month in year
public class enum_6 {

    enum Result{
        PASS, FAIL, NR;
    } 
    // we can define enum inside the class also
    public static void main(String[] args) {
        
        // Week w=new Week();  --> give error as we can't create object of enum

        Week w=Week.MON;
        System.out.println(w);

        int index=Week.MON.ordinal();  // ordinal() method return the index
        System.out.println(index);

        Week []wr=Week.values();   // values() method return all the values in array and return type is enum(Week)

        for(Week w2: wr){
            System.out.println(w2 + " : " + w2.ordinal());

        }

        Result r=Result.PASS;
        System.out.println(r);
    }
}
