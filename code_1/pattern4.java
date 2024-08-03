

public class pattern4 {
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||i==n-1||j==0||j==n-1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("\n-------------------------------------------------------------------\n");
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||j==n-1||i==(n-1)/2)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("\n-------------------------------------------------------------------\n");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0||j==n-1||i==(n-1)/2)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("\n-------------------------------------------------------------------\n");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==(n-1)/2||i==n-1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("\n-------------------------------------------------------------------\n");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||i==(n-1)/2||i==n-1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("\n-------------------------------------------------------------------\n");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||i==(n-1)/2)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("\n-------------------------------------------------------------------\n");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0||j==n-1||i==j)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("\n-------------------------------------------------------------------\n");
        int count=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||i==n-1)
                System.out.print("*");
                else if(j==n-count-1){
                    System.out.print("*");
                    count++;
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("\n-------------------------------------------------------------------\n");

        count=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0)
                System.out.print("*");
                else if(j==n-count){
                    System.out.print("*");
                    count++;
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("\n-------------------------------------------------------------------\n");
        // n=10;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || i+j==n-1){
                    System.out.print("*");
                }
                else
                System.out.print(" "); 
            }
            System.out.println();
        }
        
        System.out.println("\n-------------------------------------------------------------------\n");


        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0 || j==n-1 ||i==j && i<n/2 && j<n/2 || i+j==n-1 && i<n/2 )
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
       }

    }
}
