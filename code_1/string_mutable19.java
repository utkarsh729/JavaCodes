// Mutable Strings
public class string_mutable19 {
    public static void main(String[] args) {
        StringBuilder str1=new StringBuilder("Virat");
        // StringBuilder str1="virat";  --> wrong syntax 
        System.out.println(str1);
        str1.append("kholi");
        System.out.println(str1);

        StringBuffer str2=new StringBuffer("Utkarsh");
        System.out.println(str2);
        str2.append("singh");
        System.out.println(str2);
    }
}
