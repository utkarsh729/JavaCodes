public class ternaryOperator2 {
    public static void main(String args[]){
        int a=10;
        int b=4;
        int c=6;
        char res= (a>b)?'a':'b';
        System.out.println(res);
        int r=(a<b)?a:b;
        System.out.println(r);
        int less=(a<b)?(a<c)?a:c:(b<c)?b:c;
        System.out.println(less);
    }
}
