import java.util.ArrayDeque;
import java.util.Queue;

class ArrayDequeDemo{
    public static void main(String[] args){
        ArrayDeque<Integer> dq=new ArrayDeque<>();

        dq.add(1);
        dq.add(2);
        dq.offer(3);

        dq.offerFirst(4);
        System.out.println(dq);

        dq.offerLast(5);
        System.out.println(dq);

        
        System.out.println("Remmoved Element : "+dq.pollFirst());
        System.out.println(dq);
        
        System.out.println(dq);
        System.out.println("Remmoved Element : "+dq.pollLast()); 

        System.out.println(dq);
        System.out.println("Peek Element : "+dq.peek()); 


    }
}