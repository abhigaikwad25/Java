public class casting{
    public static void main(String[] argu){
        //casting
        //Because iof the double size is 8 bytes and the int size is 4 byte = Implicit Casting 
        double cost=100;
        double finalCost=cost+18;

        System.out.println(finalCost);

        int c=100;
        // int fc=c+18.0;         //Giving error because int size is 4 bytes and the double size is 8 byte it cant match

        int fc=c+(int)18.99;               //it will not conside element after decimal point
        System.out.println(fc);




        //Final keyword = Work as a const keyword 

        final float pi=3.14F;
        // pi=3.50F;
        
        System.out.println("pi = "+pi);


    }
}