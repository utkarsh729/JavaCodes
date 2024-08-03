
public class string15 {
    public static void main(String[] args) {
        // case 1 --> golu si  toh is ulog
        String str1="Utkarsh Singh";
        int len=str1.length();
        String str2="";
        for(int i=len-1;i>=0;i--){
            str2=str2+str1.charAt(i);
        }
        System.out.println(str2);

        System.out.println("\n-----------------------------------------------------------------------\n");
        
        // Case 2 --> golu si toh si golu
        String str3="Utkarsh Singh is Goat";
        String s1[]=str3.split(" ");
        len=s1.length;
        String str4="";
        for(int i=len-1;i>=0;i--){
            str4=str4+s1[i]+" ";
        }
        str4=str4.trim(); // removes space from front and end... here I am using to remove one extra space from end

        System.out.println(str4);  
        
        System.out.println("\n-----------------------------------------------------------------------\n");
        
        // case 3 --> Golu si toh ulog is

        String str5="Utkarsh Singh is GOat";
        String str6="";
        String s2[]=str5.split(" ");
        len=s2.length;
        for(int i=0;i<len;i++){
            String st=s2[i];
            for(int j=st.length()-1;j>=0;j--){
                str6=str6+st.charAt(j);
            }
            str6=str6+" ";
        }
        System.out.println(str6.trim());
        
    }
}