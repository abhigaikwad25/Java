class Animal{
    int a=10;
    int b=100;
    public void sound(){
        System.out.println("From animal class");
    }
}

public class Inheritance extends Animal{
    public static void main(String[] args){
        Inheritance obj1=new Inheritance();
        System.out.println("From dog classssss");
        System.out.println(obj1.a+obj1.b);
        obj1.sound();
    }
}