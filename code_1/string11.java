public class string11 {
    public static void main(String[] args) {
        String str1="Golu";   // immutable string
        System.out.println(str1);
        str1.concat("utkarsh");
        System.out.println(str1);
        str1="hello";      // stirng can be changed but not can't be edited
        System.out.println(str1);

        StringBuilder str2=new StringBuilder("Golu");  // mutable string
        System.out.println(str2);
        str2.append(" ekaa");
        System.out.println(str2);
    }
    
}
