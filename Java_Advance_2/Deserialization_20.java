import java.io.*;

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
public class Deserialization_20 {
    public static void main(String[] args) throws Exception {

        // FileInputStream fis=new FileInputStream("ser.txt");
        // ObjectInputStream ois=new ObjectInputStream(fis);

        // Cricketer cric=(Cricketer)ois.readObject();  // return type is object..downcast to cricketer object
        // cric.Display();

        // yaha humne koi bhi object nahi banaya cricketer class ka ..hum object jo file mai serialize kiya tha 
        // vahi use kiya hai Deserialize karke


        //OR --> use bufferedinputstream for efficiency

        FileInputStream fis=new FileInputStream("ser.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        ObjectInputStream ois=new ObjectInputStream(bis);

        Cricketer cric=(Cricketer)ois.readObject();  // return type is object..downcast to cricketer object
        cric.Display();

        ois.close();



    }   
}
