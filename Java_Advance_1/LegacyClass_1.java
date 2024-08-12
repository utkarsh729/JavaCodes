// package Revision;

import java.security.DrbgParameters.NextBytes;
import java.util.*;

public class LegacyClass_1  {
    public static void main(String[] args) {
        // before collections legacy classes are used in java ...like vector stack and etc.
        // Enumeration is used in legacy classes to iterate the data
        
        Vector v=new Vector();
        v.add(100);
        v.add("golu");
        v.add(300);

        System.out.println(v);

        Enumeration en=v.elements();

        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
        // with legacy classes we can also use iterator ..but can't use enumeration with collections

        Iterator itr=v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
