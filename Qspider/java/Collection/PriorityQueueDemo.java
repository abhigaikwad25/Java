import java.util.PriorityQueue;

class PriorityQueueDemo{
    public static void main(String[] args){
        PriorityQueue<Integer>  pq=new PriorityQueue<>();

        pq.add(30);
        pq.offer(40);
        pq.add(10);
        pq.offer(20);

        System.out.println(pq);

        System.out.println();
        pq.poll();
        System.out.println(pq);


        pq.add(60);
        System.out.println(pq);
    }
}