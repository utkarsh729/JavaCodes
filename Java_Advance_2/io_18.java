import java.io.*;
public class io_18 {
    public static void main(String[] args) throws IOException {
        // PrintWriter

        // using bufferedwriter or filewriter we can't store boolean,float double and int data type in file
        // for this we use printWriter

        File d2=new File("Dir2");
        
        File f2=new File(d2,"file2.txt");

        FileWriter fw2=new FileWriter(f2);

        PrintWriter pw=new PrintWriter(fw2);

        pw.write(97);  // corresponding ASCII value file mai jayegi
        pw.write("\n");

        //println --> after printing next line...print --> will print in same line
        pw.println("Hello everyone");
        pw.println(7);  // 7 as it is jayega file
        pw.print(true);
        pw.println(" "+40.323);
        pw.print('s');

        pw.close(); // internally close fw2.close()


    }
}
