public class Date_1 {
    public static void main(String[] args) {


        java.util.Date dt1=new java.util.Date();
        // util package ki date mai non parameterised constructor  hai
        System.out.println(dt1);  // give date day zone and time

        long timeInMs=dt1.getTime();

        java.sql.Date dt2=new java.sql.Date(timeInMs);
        // sql package ki date class mai non parameterised constructor nahi hai ..isliye usmai parameter pass karna hoga
        System.out.println(dt2);  // give only date

        // javap java.util.Date   type this in terminal will give all the methods present in Date class
    }
}
