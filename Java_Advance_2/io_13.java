
import java.io.*;
public class io_13 {
    public static void main(String[] args) throws IOException{
        File d2=new File("Dir2");
        System.out.println(d2.isDirectory());  // false
        d2.mkdir();
        System.out.println("Dirtectory is created : "+d2.isDirectory());

        File f2=new File(d2, "file2.txt");  // creating file inside the directory dir2
        System.out.println(f2.isFile());
        f2.createNewFile(); 
        System.out.println("File is created: "+f2.isFile());

        int count=0;
        // File d=new File(Dir2);

        // String ss="Dir2";
        // File d=new File(ss);
        
        // File d=new File("D:// dir");  we can give path also

        String str[]=d2.list();  // return string array of all the files present in perticular directory

        for(String s: str){
            count++;
            System.out.println("The file present is: "+s);
        }
        System.out.println("The total number of files are: "+count);


    }
}
