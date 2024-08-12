class Student{
    String name;
    int age;
    String city;
    
    public Student(String name, int age, String city){
        this.name=name;
        this.age=age;
        this.city=city;
    }
    public String toString(){
        return "Name: "+name+" Age: "+age+" City: "+city;
    }

}
public class IO_11 {
    public static void main(String[] args) {
        Student st1=new Student("Utkarsh",20,"LKO");
        System.out.println(st1);   
 // agar hum toString ko overide nahi karenge aur direct object ko print karenge toh object ka hashcode/address print hoga

        Student st2=new Student("Ekaa",20,"Luck");
        System.out.println(st2);
    }
}
