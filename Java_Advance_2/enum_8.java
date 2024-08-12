enum Result{
    PASS,FAIL,NR,Y;
}
public class enum_8 {
    public static void main(String[] args) {
        Result res=Result.Y;

        switch(res){  // we can pass enum in switch case
            case PASS: System.out.println("Passed!");
            break;
            case FAIL: System.out.println("Failed!");
            break;
            case NR: System.out.println("No Result");
            break;
            // case 2: System.out.println("for check");  --> enum ke case he add kr sakte hai
            // break;
            default : System.out.println("Default case");

    
        }
    }
}
