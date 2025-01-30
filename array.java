import java.util.Arrays;


public class array{
    public static void main(String[] args){

        //declaring array
        int[] marks=new int[4];
        marks[0]=50;
        marks[1]=56;
        marks[2]=45;
        marks[3]=70;

        System.out.println("Array Length : "+marks.length);
        System.out.println("First Element : "+marks[0]);

        //Sort
        Arrays.sort(marks);
        System.out.println("First Element : "+marks[0]);



        //Math
        System.out.println(Math.min(10,12));
        System.out.println(Math.max(10,12));

        
        //Random
        System.out.println("your luck out of 10 : "+(int)(Math.random()));
    }
}