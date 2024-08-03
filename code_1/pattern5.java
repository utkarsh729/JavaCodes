public class pattern5 {
    public static void main(String[] args) {
        int n=15;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if( i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 || i==(n-1)/2 && j<=(n-1)/2 || j==(n-1)/2 && i>0)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("\n--------------------------------------------------------------\n");
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if( i==0 && j<(n-1)/2 || j==0 || j==(n-1)/2 && i>0 && i<n-1 || i==n-1 && j<(n-1)/2)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("\n--------------------------------------------------------------\n");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if( i==0 && j<(n-1)/2 || j==0 || j==(n-1)/2 && i>0 && i<n-1 || i==n-1 && j<(n-1)/2)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.print("    ");
            for(int j=0;j<n;j++){
                if( i==0 && j<(n-1)/2 || j==0 || j==(n-1)/2 && i>0 && i<n-1 || i==n-1 && j<(n-1)/2)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("\n--------------------------------------------------------------\n");
        n=10;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if( i==0 || j==0 || j==n-1 || i==n-1 || i==j || i+j==n-1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("\n--------------------------------------------------------------\n");
        n=9;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if( i==0 || i==n-1 || j==0 || j==n-1 || i+j==(n-1)/2 || i-j == (n-1)/2 || j-i == (n-1)/2 || i+j==n-1+(n-1)/2)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("\n--------------------------------------------------------------\n");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if( i==0 || j==0 || i+j==(n-1)/2 || i+j<(n-1)/2 || j-i==(n-1)/2 || j-i>(n-1)/2 || i-j==(n-1)/2 || i-j>(n-1)/2 || i+j == (n-1)+(n-1)/2 || i+j > (n-1) + (n-1)/2)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("\n--------------------------------------------------------------\n");
    }
}
