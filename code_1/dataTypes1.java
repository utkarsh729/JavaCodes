public class dataTypes1 {
    static public void main(String... args){
        byte a=10;
        byte b=5;
        // byte c=a+b;  --> give error as addition/substraction/etc give result in integer
        int c=a+b;
        System.out.println(c);
        float f=6.45f;
        System.out.println(f);
        // type casting
        int x=5;
        double d;
        d=x;  // implicit type casting
        System.out.println(d);
        double n1=45.22;
        int n2=(int)n1;
        System.out.println(n2);

        int num1=12;
        int num2=5;
        float res=num1/num2;  // int/int result will be integer and it is stored in float so it will be 2.0 not 2.2 or 2
        System.out.println(res);
        char ab='a';
        char ba='b';
        System.out.println(ab*ba);
        System.out.println(4.5%3.2);
    
    }
}
