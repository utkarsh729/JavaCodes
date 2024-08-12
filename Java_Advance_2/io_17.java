import java.io.*;
public class io_17 {
    public static void main(String[] args) {

        // Buffered Reader
        // it is more efficient way to read the data from file..it can read whole line instead of single character
        File d1=new File("Dir1");
        File f1=new File(d1,"file.txt"); 

        try{
            FileReader fr1=new FileReader(f1);
            BufferedReader br1=new BufferedReader(fr1);
            String line=br1.readLine();
            while(line!=null){
                System.out.println(line);
                line =br1.readLine(); // read next line
            }

        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
}
