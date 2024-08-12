import java.io.*;
public class io_14 {
    public static void main(String[] args) throws IOException {
        // Writing into the file
         
        File d=new File("Dir1");
        
        File f1 =new File(d,"file1.txt");

        try{
            f1.createNewFile();
        }
        catch(Exception ob){
            System.out.println(ob);
        }

        FileWriter fw1=new FileWriter(f1);  //will throw exception ..here i ducked the exception 
        // FileWriter fw1=new FileWriter(f1,false); Acutally ye aisa hota hai ..by default false hota hai..
        // ... mtlb agar hum file mai naya data write karenge toh purana data delete ho jayega
        // FileWriter fw1=new FileWriter(f1,true);  --> isse existing data effect nahi hoga

        fw1.write("Golu uu");
        fw1.write("\n");
        fw1.write(7);  // ASCII value of 7 will store in file 
        fw1.write("\n");
        fw1.write(65+"\n");  // here 65 will print..
        fw1.write(65);   // ASCII value of 65 will print
        fw1.write("\n");  
        char []ch={'M','O','L','U'};
        fw1.write(ch);  // we can also write character array in fw1
    

        // fw1.close(); // agar resourse ko hum close ya flush nahi karenge to file mai writing nahi karenge
        // jvm will think that abhi aur data aayega.. toh likhungu file mai

        fw1.flush();  // flush karne ke baad hum file mai aur data bhi add kr sakte hai

        fw1.write("\nUtkarsh\n");
        fw1.write("done");
        fw1.close();

        // fw1.write("You can't"); stream close karne ke baad file mai write nahi kr sakte

        System.out.println("Writing done open to see  ");


    }
}
