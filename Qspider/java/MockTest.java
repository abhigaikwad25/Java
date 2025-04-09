//write a progeam to find special two digit no.  eg.59

// import java.util.Scanner;
// class MockTest{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a Number : ");
//         int num=sc.nextInt();
//         int firstDigit=num/10;
//         int lastDigit=num%10;
//         int res=(firstDigit*lastDigit)+(firstDigit+lastDigit);
//         if(res==num){
//             System.out.println("Special Number");
//         }
//         else{
//             System.out.println("Not Special Number");
//         }
//     }
// }

//===========================================================================================================================

//write a java program to fid greatest of 3 no. using conditionall operaator

// import java.util.Scanner;
// class MockTest{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a 1st Number : ");
//         int a=sc.nextInt();
//         System.out.print("Enter a 2nd Number : ");
//         int b=sc.nextInt();
//         System.out.print("Enter a 3rd Number : ");
//         int c=sc.nextInt();

//         System.out.println((a>b && a>c)?a+ " is greatest number":(b>c && b>a)?b+" is greatest number":c+ " is greatest number");
//     }
// }


//===========================================================================================================================




//find even and odd without using % operator


// import java.util.Scanner;
// class MockTest{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a Number : ");
//         int num=sc.nextInt();
//         if(((num/2)*2)==num){
//             System.out.println(num + " is Even Number");
//         }
//         else{
//             System.out.println(num + " is a odd Number");
//         }
//     }
// }




//===========================================================================================================================



//write a java program to find user entered character is alphabet, digit or special character



// import java.util.Scanner;
// class MockTest{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter Someting : ");
//         char ch=sc.next().charAt(0);
//         if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
//             System.out.println(ch + " is a Character");
//         }
//         else if(ch>='1' && ch<='9'){
//             System.out.println(ch + " is a Digit");
//         }
//         else{
//             System.out.println(ch + " is a Special Characcter");
//         }  
//     }
// }


//===========================================================================================================================




//write a progam to find user entered date is valid or not


// import java.util.Scanner;
// class MockTest{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a Date : ");
//         int date=sc.nextInt();
//         System.out.print("Enter a Month : ");
//         int month=sc.nextInt();
//         System.out.print("Enter a Year : ");
//         int year=sc.nextInt();

//         if(date>31 || date<=0 || month>12 || month<=0 || year<=0){
//             System.out.println("Invalid date");
//         }
//         else if(month==2 && date>29){
//             System.out.println("Invalid date");
//         }
//         else if(month==2 && date<=29){
//             if(((year%4==0 && year%100!=0) || year%400==0) && date<=29){
//                 System.out.println("Valid date");
//             }
//             if(date>28){
//                 System.out.println("Invalid date");
//             }
//         }
//         else if((month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) && date>=31){
//             System.out.println("Invalid date");
//         }
        
//         else if((month==4 || month==6 || month==8 || month==9 || month==11) && date>30){
//             System.out.println("Invalid date");
//         }
//         else{
//             System.out.println(date+"/"+month+"/"+year+" is valid date");
//         }
//     }
// }

//write a program to find smallest and biggest digit from the number

// import java.util.Scanner;
// class MockTest{
//     public static void main(String[] args){
//         Scanner sc =new Scanner(System.in);
//         System.out.print("Enter any Number : ");
//         int num=sc.nextInt();
//         int big=-9;
//         int small=9;
//         while(num!=0){
//             int rem=num%10;
//             if(rem>big){
//                 big=rem;
//             }
//             else if(rem<small){
//                 small=rem;
//             }
//             num=num/10;
//         }
//         System.out.println("Biggest number is : "+big);
//         System.out.println("Biggest number is : "+small);
//     }
// }


//===========================================================================================================================



//write a java program to find perfect number



// import java.util.Scanner;
// class MockTest{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a Number : ");
//         int num=sc.nextInt(); //6
//         int sum=0;
//         for(int i=1;i<=num/2;i++){
//             if(num%i==0){
//                 sum+=i;
//             }
//         }
//         if(sum==num){
//             System.out.println("Perfect Number");
//         }
//         else{
//             System.out.println("Not Perfect Number");
//         }
//     }
// }





//=====================================================================================================================




//find count of even and digit from number 

// import java.util.Scanner;
// class MockTest{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a Number : ");
//         int num=sc.nextInt();
//         int evenCount=0;
//         int oddCount=0;
//         while(num!=0){
//             int rem=num%10;
//             if(rem%2==0){
//                 evenCount++;
//             }
//             else{
//                 oddCount++;
//             }
//         }
//     }
// }


//======================================================================================================================




//write a program to find factorial of each digits of a number



// import java.util.Scanner;
// class MockTest{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a Number : ");
//         int num=sc.nextInt();
//         int i=0;
//         int sum=0;
//         while(num!=0){
//             int rem=num%10;
//             sum=sum+rem;
//             i++;
//             num=num/10;
//         }
//         if((sum/i)%2==0){
//             System.out.println("Average is even");
//         }
//         else{
//             System.out.println("Average is odd");
//         }
//     }
// }




//write a progam to find average of digits of a number and check avg is even or odd



// import java.util.Scanner;
// class MockTest{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a Number : ");
//         int num=sc.nextInt();
//         while(num!=0){
//             int rem=num%10;
//             int fact=1;
//             for(int i=rem;i>=1;i--){
//                 fact*=i;
//             }
//             System.out.println("Factorial of "+ rem +" : " + fact);
//             num=num/10; 
//         }
//     }
// }









//==============================================================================================
