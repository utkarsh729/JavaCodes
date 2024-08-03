class toYoung extends Exception{
    toYoung(String str){
        super(str);
    }
}
class toOld extends Exception{
    toOld(String str){
        super(str);
    }
}
public class practice2 {
    public static void main(String[] args) {
        try{
            System.out.println("in try");
            new toYoung("bache ho");
        }
        catch(Exception e){
            System.out.println("hkgh"+e);
        }
    }
}
