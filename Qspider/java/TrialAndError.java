class trialAndError{

    static{
        // trialAndError obj1=new trialAndError();
        displayCar();
    }
    
    static String name="TATA";
    static String brand;
    static int seatCount;
    static double price; 


    public static void displayCar(){
        System.out.println("Name : "+ name);
        System.out.println("Brand : "+ brand);
        System.out.println("seatCount : "+ seatCount);
        System.out.println("Price : "+ price);
    }

    public static void main(String[] args){
        trialAndError obj1=new trialAndError();
        System.out.println();
        obj1.displayCar();
        System.out.println();
        obj1.name="BYD";
        obj1.displayCar();

    }

}


// class trialAndError{
//     public static void main(String[] args){
//         car obj1=new car();
//         obj1.displayCar();
//     }
// }
