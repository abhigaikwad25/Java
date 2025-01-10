public class functionDemo{

    public static void printHello(){
        System.out.println("Print Hello.....");
    }

    public static void hello(){
        printHello();
        System.out.println("Hello Print");

    }

    public static void main(String[] args){
        // printHello();
        hello();
    }
}