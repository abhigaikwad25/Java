//1)Write a java program to print Salman if no is divisible by 3 print aashwarya if no if divisible by 5 if sam=lman lob=ves aashwarya if no is divisible by 3 and 5 else breakup
// import java.util.Scanner;

// class salmanAshwa{
//     public static void main(String [] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a Number : ");
//         int num=sc.nextInt();
//         if(num%3==0 && num%5==0){
//             System.out.println("Salman Loves Aishwarya");
//         }
//         else if(num%3==0 ){
//             System.out.println("Salman");
//         }
//         else if(num%5==0){
//             System.out.println("Aishwarya");
//         }
//         else{
//             System.out.println("Breakup");
//         }
//     }
// }










//2) //Write a java program to check user entered no is divisible by 3 and 5 or not
// import java.util.Scanner;

// class abc{
//     public static void main(String [] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a Number : ");
//         int num=sc.nextInt();
//         if(num%3==0 && num%5==0){
//             System.out.println("Divisible by 3 and 5");
//         }
//         else{
//             System.out.println("Not Divisible by 3 and 5");
//         }
//     }
// }



//3) //check user entered number is three digits number or not
// import java.util.Scanner;
// class salmanAshwa{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a Number : ");
//         int num=sc.nextInt();

//         if(num<=999 && num>=100){
//             System.out.println("3 digit no");
//         }
//         else{
//             System.out.println("not 3 digit no");
//         }
//     }
// }


//4) Write a java program user entered no is 5 digit no or not
// import java.util.Scanner;
// class salmanAshwa{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a Number : ");
//         int num=sc.nextInt();

//         if(num<=99999 && num>=10000){
//             System.out.println("5 digit no");
//         }
//         else{
//             System.out.println("not 5 digit no");
//         }
//     }
// }







// //write a java program to take input and pri t not married if it is 1 digit no ,print married if it is 2 diggit no, print married and having kids if it is more than 2 digit no , print dead if no is zero
// import java.util.Scanner;
// class salmanAshwa{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a Number : ");
//         int num=sc.nextInt();

//         if(num<=9 && num>=1){
//             System.out.println("Not Married");
//         }
//         else if(num<=99 && num>=10){
//             System.out.println("Married");
//         }
//         else if(num>=100){
//             System.out.println("Married and having a kids");
//         }
//         else if(num==0){
//             System.out.println("Dead");
//         }
//         else{
//             System.out.println("Divorsed");
//         }
//     }
// }




//uer entered year is leep year or not 


// import java.util.Scanner;

// class salmanAshwa{
//     public static void main(String [] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a Number : ");
//         int year=sc.nextInt();
//         if(year%4==0 && year%100!=0 || year%400==0){
//             System.out.println("leep year");
//         }
//         else{
//             System.out.println("Not leep year");
//         }
//     }
// }

//Note : Condition to cj==hecks leep year year should be divisible by 4 and it should not be divisible by 100 year should be divisible by 400 if any condition 




///read amount from user and print in indian currency dimension 
/// 
import java.util.Scanner;
class salmanAshwa{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int amount=sc.nextInt();
        int fiveHund=0;
        int twoHund=0;
        int oneHund=0;
        int fifty=0;
        int twenty=0;
        int ten=0;
        int five=0;
        int two=0;
        int one=0;
        
        fiveHund=amount/500;
        amount=amount%500;

        twoHund=amount/200;
        amount=amount%200;

        oneHund=amount/100;
        amount=amount%100;

        fifty=amount/50;
        amount=amount%50;
    
        twenty=amount/20;
        amount=amount%20;
            
        ten=amount/10;
        amount=amount%10;

        twoHund=amount/5;
        amount=amount%5;
    
        twoHund=amount/2;
        amount=amount%2;
    
        twoHund=amount/1;
        amount=amount%1;
        

        System.out.println("Five Hundred's Currency Count : "+fiveHund);
        System.out.println("Two Hundred's Currency Count : "+twoHund);
        System.out.println("One Hundred's Currency Count : "+oneHund);
        System.out.println("Fifty's Currency Count : "+fifty);
        System.out.println("twenty's Currency Count : "+twenty);
        System.out.println("ten's Currency Count : "+ten);
        System.out.println("Five's Currency Count : "+five);
        System.out.println("two's Currency Count : "+two);
        System.out.println("one's Currency Count : "+one);
    }
}






//write a program o find user given number is perfect number or not