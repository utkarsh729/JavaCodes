import java.io.*;
public class io_15 {
    public static void main(String[] args) throws Exception {
        // REading from the file

        File d1=new File ("Dir1");
        File f1=new File(d1,"file1.txt");

        // try{
        //     FileReader fr=new FileReader(f1);  // iska scope issi block mai hoga

        //     int i =fr.read(); // read() return the ASCII value of Data..so return type is integer

        //     while(i!=-1){  // internally -1 dipect the end of file 
        //         System.out.print((char)i);
        //         i=fr.read();  // read next data
        //     }
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        
        // int i=fr.read(); give error ..scope

        // OR

        FileReader fr=new FileReader(f1);  // duck the exception

        int i=fr.read();
        while(i!=-1){
            System.out.print((char)i);
            i=fr.read();
        }
        // not good approach as we are calling read() again and again
        
        char ch[]=new char[(int)f1.length()];  // length()..return type is long and array accept in int...so downcast it
        fr.read(ch); // read all the character from file and store in character array
        for(char c:ch){
            System.out.print(c);
        }
        fr.close();


    }
}
