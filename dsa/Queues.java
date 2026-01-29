
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> q =new PriorityQueue<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q);
        q.poll();
        q.remove();
        // while(!q.isEmpty()){
        //     System.out.println(q.peek());
        //     q.remove();
        //}
        System.out.println(q);


    }
}
