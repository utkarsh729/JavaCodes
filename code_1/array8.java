public class array8 {
    public static void main(String[] args) {
        // 2-D ARRAY
        int arr[][]=new int[3][2];
        System.out.println(arr[0][1]);  // zero will print

        arr[0][0]=4;
        arr[0][1]=14;
        arr[1][0]=3;
        arr[1][1]=7;
        arr[2][0]=9;
        arr[2][1]=8;

        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("====================================================");

        int num[][]={ {4,14}, {3,7}, {9,8} };

        // enhanced for loop 
        for(int i[]: num){
            for(int j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }


    }
}
