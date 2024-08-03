// to check whether string is palindrome or not
public class string16 {
    public static void main(String[] args) {
        String str1="howohj";
        String str2="";
        for(int i=str1.length()-1;i>=0;i--){
            str2=str2+str1.charAt(i);
        }
        if(str1.equals(str2)){
            System.out.println("string is panlindrome");
        }
        else
        System.out.println("not");
    }
}
