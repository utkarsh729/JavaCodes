import java.io.*;
public class io_16 {
    public static void main(String[] args) throws IOException {

        // Buffered Writer
        
        File d1=new File("Dir1");

        File f1=new File(d1,"file.txt");

        FileWriter fw1=new FileWriter(f1,true);  // if file is not present in directory then it will create a file

        BufferedWriter bw1=new BufferedWriter(fw1);  //filewriter use karna hoga isko use karne ke liye
        // ye more efficient way hai

        bw1.write("Hello! baby");
        bw1.newLine();  // start next writing from new line
        bw1.write(65);  // A
        bw1.newLine();
        String str="RAm ram";
        bw1.write(str);
        bw1.newLine();
        char []ch={'r','o','1',3};
        bw1.write(ch);
        bw1.newLine();
        // bw1.write(true); CE
        // bw1.write(4.5);  CE

        // bw1.flush();  // it ensure writing must to be done in file

        bw1.close();  // internally closes fw1.close() also

        System.out.println("done dana done");



    }
}
