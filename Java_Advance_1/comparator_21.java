import java.util.*;

class Student{
    int marks;
    int age;
    String name;

    Student(int marks, int age, String name){
        this.marks=marks;
        this.name=name;
        this.age=age;
    }

    public String toString(){
        return marks+" - "+age+" - "+name;
    }
}

// class Alpha implements Comparator<Student>{   // Comparator is functional interface
//     public int compare(Student a, Student b){
//         if(a.age>b.age){
//             return 1;
//         }
//         else{
//             return -1;
//         }
//     }
// }

public class comparator_21 {
    public static void main(String[] args) {

        Student st1=new Student(34,12,"Ramesh");
        Student st2=new Student(78,20,"Yoga");
        Student st3=new Student(45,13,"Guddu");
        // System.out.println(st1);

        List<Student> l=new ArrayList<Student>();
        l.add(st1);
        l.add(st2);
        l.add(st3);

        System.out.println(l);

        // Collections.sort(l); error as...object contain more then one value..so you have to give on what basis you want to sort
        System.out.println();
        // Alpha a=new Alpha();
        // Collections.sort(l,a);


        // Comparator is functional interface..we can give function body using lambda expression
        // Comparator<Student> com=(Student a, Student b)->{
        //     if(a.age>b.age){
        //         return 1;
        //     }
        //     else{
        //         return -1;
        //     }
        // };

        // comparator is used when jab humko class ka access na ho aur humko object ko bhi sort karna chahte ho
        
        // Collections.sort(l,com);
        // System.out.println(l);

            Collections.sort(l,
            (Student a, Student b)->{
                if(a.age>b.age){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        );

        System.out.println(l);
        
    }
}
