import java.util.*;
public class PriorityQueue_6 {
    public static void main(String[] args) {
        PriorityQueue pq1=new PriorityQueue();
        
        pq1.add(10);
        pq1.add(35);
        pq1.add(5);
        pq1.add(65);
        pq1.add(92);
        pq1.add(1);
        pq1.add(35);  // duplicates are allowed
        // pq1.add("Golu");  --> in PriorityQueue mixed data types is not allowed
        // pq1.add(4.4);
        
        System.out.println(pq1);

        // insertion order is not maintained in priorityQueue
        // internally PriorityQueue uses Minimum Heap Data Structure

        PriorityQueue pq2=new PriorityQueue();
        pq2.add("Golu");
        pq2.add("Utkarsh");
        pq2.add("Gul");
        pq2.add("Hanu");
        pq2.add("Neha");

        System.out.println(pq2);



        
    }
}
