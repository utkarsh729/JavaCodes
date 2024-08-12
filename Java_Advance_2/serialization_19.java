// import java.io.Serializable;
// import java.io.BufferedOutputStream;
// import java.io.FileOutputStream;
// import java.io.ObjectOutputStream;

import java.io.*;

// Serializable is marker interface...means no  method is declared in this interface
// at run time Jvm he internally ..jo bhi requirement hai object ko serializable banane ke liye jvm khud he kr lega
class Cricketer implements Serializable{
    private String name;
    private int age;
    private int run;

    public Cricketer(String name, int age, int run){
        this.name=name;
        this.age=age;
        this.run=run;
    }
    public void Display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(run);
    }

}
public class serialization_19 {
    public static void main(String[] args) throws Exception {

        Cricketer c=new Cricketer("virat",37,23419);
        c.Display();

        // Serialization

        // FileOutputStream fos=new FileOutputStream("ser.txt");
        // ObjectOutputStream oos=new ObjectOutputStream(fos);

        // oos.writeObject(c);

        // oos.flush();  // flush karne se assurity milti hai ki object file mai ja raha 
        // oos.close();

    // OR --> to make process efficient use BufferedOutputStream 

        FileOutputStream fos=new FileOutputStream("ser.txt");   // if file is not present..it will create a file
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        ObjectOutputStream oos=new ObjectOutputStream(bos);

        oos.writeObject(c);

        oos.flush();  // flush karne se assurity milti hai ki object file mai ja raha 
        oos.close();


        


    }
}
