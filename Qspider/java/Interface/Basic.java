interface A     //this use to implement as a abstract class  
{
    int num=20;  //they are by default final and staticṇ

    void show();        //they are by default public abstract
    void program();
}

class B implements A
{
    public void show(){
        System.out.println("in show");
    } 

    public void program(){
        System.out.println("in program");
        System.out.println(num);
    } 


}

class Basic{
    public static void main(String[] args){
        B obj=new B();
        obj.show();
        obj.program();
    }
}