enum Result{
    // PASS, FAIL, NR;  // constant
    PASS,
    FAIL,
    NR;

    // Three constant banaye hai toh enum ka constructor three times call hoga

    // behind the scene every constant call constructor...look below

    // public static final Result PASS=new Result();
    // public static final Result FAIL=new Result();
    // public static final Result NR=new Result();

    int marks;  // we can create variable also inside enum
    
    Result(){
        System.out.println("Constructor of enum");
    }
    void setMarks(int marks){
        this.marks=marks;
    }
    int getMarks(){
        return marks;
    }

}
public class enum_7 {
   public static void main(String[] args) {

        Result.PASS.setMarks(50);

        System.out.println(Result.PASS.getMarks());
        
        int m1=Result.PASS.getMarks();
        System.out.println(m1);

        int m2=Result.FAIL.getMarks();
        System.out.println(m2);   // get 0 as default value for integer is 0

    
        Result.NR.setMarks(30);
        int m3=Result.NR.getMarks();
        System.out.println(m3);
        
    }
}
