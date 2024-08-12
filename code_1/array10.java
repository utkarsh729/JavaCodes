class calc{
    int add(int num[]){
        int sum=0;
        for(int i: num)
        sum+=i;
        return sum;
    }
}
public class array10 {
    public static void main(String[] args) {
        // ANONYMOUS ARRAY
        calc obj=new calc();
        // passing anonymous array
        System.out.println(obj.add(new int[]{4,5,1}));
        System.out.println(obj.add(new int []{1,2,3,4,9,8,7,6,5}));

    }
    
}
