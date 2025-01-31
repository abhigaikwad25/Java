class Animal{
    int a=10;
    int b=100;
    public void sound(){
        System.out.println("From animal class");
    }
}

class Birds extends Animal{
    void birdSound(){
        System.out.println("From Bird Class");
    }
}

public class Dog extends Birds{
    public static void main(String[] args){
        Dog obj1=new Dog();
        System.out.println("From dog classssss");
        System.out.println(obj1.a+obj1.b);
        obj1.sound();
        obj1.birdSound();
    }
}

