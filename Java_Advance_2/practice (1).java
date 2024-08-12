import java.io.*;
public class practice{
    public static void main(String[] args) throws Exception{
        File f1=new File("Dir5");

        System.out.println(f1.isDirectory());

        f1.mkdir();

        File f2=new File("Dir5","hello.txt");
        System.out.println(f2.isFile());
        f2.createNewFile();

        FileWriter fw=new FileWriter(f2);
        fw.write("hello\n");
        fw.write(65);
        // fw.write(true);

        fw.flush();
        fw.close();

        FileReader fr=new FileReader(f2);
        int i=fr.read();
        while(i!=-1){
            System.out.print((char)i);
            i=fr.read();
        }
        System.out.println();
        fr.close();


    }
}