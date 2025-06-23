import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ArrayListDemo{

    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>();

        // List<String> list=new List<>();
    
        arr.add(10);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(7);
        arr.add(6);
        arr.add(5);
        arr.add(9);
        arr.add(8);
        arr.add(11);
        System.out.println(arr);
        System.out.println("Size : "+arr.size());

        arr.remove(1);
        System.out.println(arr);
        
        arr.remove(Integer.valueOf(7));

        arr.set(2,1000);

        List<Integer> c=new ArrayList<>(arr);

        System.out.println();

        Collections.sort(c);

        System.out.println(c);
        System.out.println(arr);



        
    }
}

