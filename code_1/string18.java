// to check pangram 
public class string18 {
    public static void main(String[] args) {
        String str="The Quick Brown fox jumps over lazy dog";
        // String str="bcd efgh ijklmn p qrst uvwxoayz";
        str=str.replace(" ",""); //1. Remove white spaces from text
        str=str.toUpperCase(); //2. convert it into lowercase or uppercase
        char []ch1=str.toCharArray(); //3. convert into character array
        char []ch2=new char[26]; //4. Create an empty array
        for(int i=0;i<ch1.length;i++){
            ch2[ch1[i]-65]++;
        }
        boolean hai=true;
        for(int i=0;i<ch2.length;i++){
            if(ch2[i]!=1){
                hai=false;
            }
        }
        if(hai)
        System.out.println("it is pangram");
        else
        System.out.println("Not");
       

       
    }
}
