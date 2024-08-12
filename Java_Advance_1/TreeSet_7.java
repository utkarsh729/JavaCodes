import java.util.*;
public class TreeSet_7 {
    public static void main(String[] args)  {
        TreeSet ts1=new TreeSet();

        ts1.add(10);
        ts1.add(35);
        ts1.add(5);
        ts1.add(65);
        ts1.add(92);
        ts1.add(1);
        ts1.add(35); 

       
        System.out.println(ts1);

        // TreeSet follows BinaryTree data structure behind the scene and follow inorder traversal
        // order of insertion is not preserved
        // duplicates value are removed.. means duplicates are not allowed
        // data comes in sorted order

        System.out.println(ts1.lower(5));
        System.out.println(ts1.higher(5));

        System.out.println(ts1.lower(40));
        System.out.println(ts1.higher(40));

        System.out.println(ts1.floor(40));
        System.out.println(ts1.ceiling(40));

        System.out.println(ts1.floor(5));
        System.out.println(ts1.ceiling(5));

        System.out.println(ts1.lower(1)); // agar koi lower value nahi hai toh null return ho jayega

        // the difference between lower/higher and floor/ceiling is that..jo value humne di hai phele vo check karega
        // floor/ceiling.. ki collection mai hai ya nahi agar nahi hai toh uski ceiling or floor value return ho jayegi
        // agar hai toh vahi value return ho jayegi
        // lower/higher mai hamesh choti aur badi value he return hogi

    }
}
