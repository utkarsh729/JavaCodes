import java.util.*;
import java.util.Map.*;
public class Map_13 {
    public static void main(String[] args) {
        Map m=new HashMap();
        
        m.put(1,"Gita");  // Entry.. every key and value is stored in object form
        m.put(2,"Sita");
        m.put(3,"Rahul");
        m.put(4,"Ramesh");

        System.out.println(m); // printing map

        Object obj=m.get(3);    // we can access data on the basis of key
        System.out.println(obj);

        System.out.println(m.get(5));  // for specified key if data is not there then it will return null

        System.out.println(m.keySet()); // return all the key in form of set
        
        Set sk=m.keySet(); 
        Iterator itr=sk.iterator();
        // iterating through all the key 
        while(itr.hasNext()){
            // System.out.println(itr.next());
            // int n=(int)itr.next();  // saari key integer hai toh ...object se integer mai downcast kr diya
            Integer n=(Integer)itr.next();
            System.out.println(n);
        }

        System.out.println(m.values()); // return type is collection ..return all the values 

        Collection val=m.values();
        
        Iterator itr2=val.iterator();
        // iterating through all the values
        while(itr2.hasNext()){
            Object o=itr2.next();
            System.out.println(o);
        }

        System.out.println(m.entrySet()); // return type is set..return all the Entry(key and value together)

        Set es=m.entrySet();
        Iterator itr3=es.iterator();
        
        // iterating through all the entry

        while(itr3.hasNext()){

            // System.out.println(itr3.next());

            Entry data=(Entry)itr3.next(); // downcast object to entry
            System.out.println(data.getKey()+ ": "+data.getValue());

        }
    }
}
