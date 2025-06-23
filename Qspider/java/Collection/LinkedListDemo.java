import java.util.LinkedList;
import java.util.ArrayList;

class LinkedListDemo{
    public static void main(String[] args){
        LinkedList<Integer> l=new LinkedList<>();
        ArrayList<Integer> arr=new ArrayList<>();

        arr.add(100);
        arr.add(200);
        arr.add(300);

        System.out.println("ArrayList");
        System.out.println(arr);

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);

        System.out.println();

        System.out.println("LinkeedList");
        System.out.println(l);

        l.addFirst(50);
        System.out.println(l);

        l.addLast(60);
        System.out.println(l);

        l.add(1,1000);
        System.out.println(l);

        System.out.println(l.getFirst());
        System.out.println(l.getLast());

        //Adding ArrayList to LinedList
        l.addAll(2,arr);

        System.out.println();
        System.out.println("After Adding ArrayList in LinedList");
        System.out.println(l);

        //Remove all element in array
        // l.clear();
        // System.out.println(l);

        System.out.println(l.contains(100)); 

        System.out.println();
        System.out.println("Give Peek element (head)");
        System.out.println(l.peek());
        System.out.println(l.element());

        System.out.println(l);

        System.out.println();
        System.out.println("Remove Head");
        l.removeFirst();
        System.out.println(l);

        System.out.println();
        System.out.println("Remove Tail");
        l.removeLast();
        System.out.println(l);

        System.out.println();
        System.out.println("Remove using Index");
        l.remove(3);
        System.out.println(l);

        System.out.println();
        System.out.println("Set (Replace element)");
        l.set(0,500);
        System.out.println(l);

        System.out.println();
        System.out.println("Offer same as add");
        l.offer(400);
        l.offerFirst(300);
        System.out.println(l);

        System.out.println();
        System.out.println("Poll same as remove");
        l.pollLast();
        l.poll() //Remove from head
        System.out.println(l);
    }
}