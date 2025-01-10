public class ExceptionDemo{
    public static void main(String[] args){
        int[] arr={20,40,25,50};
        // System.out.println(arr[5]);         //Give exception and cant execute next code
        
        //Exception handling
        try{
            System.out.println(arr[5]); 
        }catch(ArrayIndexOutOfBoundsException exception){
            //write changes for exception    execute after exception occur
        }//cant stop execution of code and execute next code
        System.out.println("I am groot");
    }
}