public class array9 {
    public static void main(String[] args) {
        // jagged array -- no. of rows are fixed but no. of columns are different
        int num[][]=new int[3][];
        // defining array column size 
        num[0]=new int[2];
        num[1]=new int[3];
        num[2]=new int[1];

        num[0][0]=1;
        num[0][1]=2;
        num[1][0]=3;
        num[1][1]=4;
        num[1][2]=5;
        num[2][0]=6;

        // printing jagged array
        for(int i=0;i<3;i++){
            for(int j=0;j<num[i].length;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("======================================================================\n");
       int sub[][]={
                        {4},
                        {6,9},
                        {1,2,3,4,5}
                   };

        for(int a[]:sub){
            for(int b: a){
                System.out.print(b+" ");
            }
            System.out.println();
        }

        System.out.println("\n--------------------------------------------------------------------\n");
        //length() --> it is method in string 
        // length --> is property of array

        int a[]=new int [7];
        System.out.println(a.length);
        System.out.println(sub.length);
        System.out.println(sub[0].length);
        System.out.println(sub[1].length);
        System.out.println(sub[2].length);


    }
    
}
