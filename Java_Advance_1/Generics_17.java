import java.util.*;

public class Generics_17 {
    public static void main(String[] args) {
        
        // typesafe
        String [] names=new String[5];
        names[0]="utkarsh";
        names[1]="Golu";
        // names[3]=10;  CE
        
        // NO typesafety
        ArrayList al1=new ArrayList();
        al1.add("utkarsh");
        al1.add("Golu");
        al1.add(10);

        String s1=(String)al1.get(0);  // typecasting
        String s2=(String)al1.get(1);
        // String s3=(String)al1.get(2);  // will give exception

        System.out.println(s1);
        System.out.println(s2);
        // System.out.println(s3);  .

        // TypeSafety achieved using generics
        ArrayList<String> al2=new ArrayList<String>();  // we have speciefied that we will work with only sting data type
        al2.add("Utkarsh");
        al2.add("Golu");
        // al2.add(10); CE 

        String n1=al2.get(0);  // here no need to typecast when using generics
        String n2=al2.get(1);
        // String n3=al2.get(2);  ..index out of bound exception

        System.out.println(n1);
        System.out.println(n2);
    }
}
