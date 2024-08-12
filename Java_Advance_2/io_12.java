import java.io.*;
public class io_12 {
    public static void main(String[] args) throws IOException {

        // CREATING FILE

        File f1=new File("file1.txt");  // in this stage it will check ki file1.txt hai ki nahi
        // agar hai toh  usse pr refer karna start kr dega
        // agar nahi hai toh file ke object pr refer karna suru kr degi

        System.out.println(f1.exists()); // false... return type is boolean..check whether is present or not

        f1.createNewFile();  // it throws exception so we have to handle it.. here i ducked the exception
        System.out.println(f1.exists()); // true

        // CREATING DIRECTORY
        File d1=new File("Dir1");

        System.out.println(d1.exists()); // false

        d1.mkdir();

        System.out.println(d1.exists()); //true


    }
}
