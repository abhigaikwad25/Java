//write a java program to print user entered date is valid or invalid 

import java.util.Scanner;
class checkDate{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Date : ");
        int date=sc.nextInt();
        System.out.print("Enter month : ");
        int month=sc.nextInt();
        System.out.print("Enter year : ");
        int year=sc.nextInt();
        if(date<1 ||  date>31 || month<1 ||  month>12 || year<1){
            System.out.println("Invalid");
        }
        else{
            if((month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)&& date<=31){
                if(date<=31){
                    System.out.println("Valid");
                }
                else{
                    System.out.println("InValid");
                }
                
            }
            else if( (month==4 || month==6 || month==9 || month==11)){
                if(date<=30){
                    System.out.println("Valid");
                }
                else{
                    System.out.println("InValid");
                }
            }
            else if(month==2){
                if(year%4==0 && year%100!=0 || year%400==0){
                    System.out.println("Valid");
                }
                else{
                    System.out.println("InValid");
                }
            }
        }
    }
}



//Write a java programm to print number from 1 to 5

// import java.util.Scanner;

// class checkDate{
//     public static void main(String[] args){
        
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter Number : ");
//         int num=sc.nextInt();
//         int i=1;
//         while(i<=num){
//             System.out.println(i);
//             i++;
//         }
        
//     }
// }














//write a progeam tto print number form n to 1

// import java.util.Scanner;

// class checkDate{
//     public static void main(String[] args){
        
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter Number : ");
//         int num=sc.nextInt();
//         int i=num;
//         while(i>=1){
//             System.out.println(i);
//             i--;
//         }
        
//     }
// }





//print sum of n number

// import java.util.Scanner;

// class checkDate{
//     public static void main(String[] args){
        
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter Number : ");
//         int num=sc.nextInt();
//         int i=1;
//         int res=0;
//         while(i<=num){
//             res+=i;
//             i++;
//         }
//         System.out.println("Sum is : "+ res);
        
        
//     }
// }

