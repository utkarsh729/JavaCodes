
import java.io.*;

class Cricketer implements Serializable{
    // transient member of class does not take part in serialization
    private String name;
    transient private int age;  // transient keyword lagane se ye field serialization mai part nahi legi
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

public class Transient_21 {
    public static void main(String[] args) throws Exception{

        Cricketer c=new Cricketer("Dhoni",44,34211);
        c.Display();  // age print hoga

        // serialize
        FileOutputStream fos=new FileOutputStream("trans.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        ObjectOutputStream oos=new ObjectOutputStream(bos);

        oos.writeObject(c);
        oos.flush();
        oos.close();

        //Deserialize
        FileInputStream fis=new FileInputStream("trans.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        ObjectInputStream ois=new ObjectInputStream(bis);

        Cricketer cric=(Cricketer)ois.readObject();

        cric.Display();  // age print nahi hogi...default value print hogi i.e 0

        ois.close();


    }
}
