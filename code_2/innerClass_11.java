// inner class -- member, static and anonymous ....three types of class


class Outer{   // outer can't be decalered as static
    public void show(){
        System.out.println("Outer ");
    }
    class Inner1{  // inner member class
        public void in1(){
            System.out.println("inner 1");
        }
    }
    static class Inner2{   // inner static class
        public void in2(){
            System.out.println("Static inner 2");
        }
    }
}

public class innerClass_11 {
    public static void main(String[] args) {
        Outer obj=new Outer();

        // Inner i1=new Inner(); can't make object of inner class directly

        Outer.Inner1 i1= obj.new Inner1();
        Outer.Inner1 i3= new Outer().new Inner1();
        // to make object of member inner class ...outer class ka name or object use krna hoga

        Outer.Inner2 i2= new Outer.Inner2();
        // to make object of static inner class... outer class ka name use karna hoga

        obj.show();
        // obj.in1(); --> can't access the inner class member with the outer class object
        // obj.in2(); error

        i1.in1();
        i3.in1();
        i2.in2();
        
        new Outer().new Inner1().in1();
        // anonymous object se bhi inner class ke method ko bula sakte hai kuch iss prakar
        // new.Outer().new Inner2().in2();  --> error as not applicable for static inner class

        
    }
}
