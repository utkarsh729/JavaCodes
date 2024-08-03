public class array7 {
    public static void main(String [] args){
        int a[]={3,5,32};
        System.out.println(a); // will print garbage value
        int [] b=new int[4]; // array creating 
        // int []c=new int [3]; 
        // by default all the values in array are intiliased to zero
        for(int i: b){
            System.out.println(i);
        }
    }

    
}
