import java.util.Stack;

class StackDemo{
    public static void main(String[] args){  //LIFO

        Stack<String> car=new Stack<>();

        car.push("mustang");
        car.push("fortuner");
        car.push("omni");
        car.push("echo");

        System.out.println("Stack : ");
        System.out.println(car);

        System.out.println();
        System.out.println("Peek element :  ");
        System.out.println(car.peek());

        System.out.println();
        System.out.println("Check empty or not :");
        System.out.println(car.empty());


        System.out.println();
        System.out.print("Pop element : ");
        System.out.println(car.pop());
        System.out.println("After POP operation");
        System.out.println(car);


        System.out.println();
        System.out.println(car.search("omni"));
    }
}