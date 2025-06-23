import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


class HashSetDemo{
    public static void main(String[] args){
        // Set<Integer> set=new HashSet<>();

        // Set<Integer> set=new LinkedHashSet<>();

        Set<Integer> set=new TreeSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println(set);

        set.remove(30);
        System.out.println(set);

        System.out.println(set.contains(20));

        System.out.println(set.isEmpty());

        set.clear();

        System.out.println(set);
    }
}
