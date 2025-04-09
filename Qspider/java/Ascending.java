

//write a program to take 3 different integer and print it in ascending order


// import java.util.Scanner;
// class Ascending{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter any 3 Number : ");
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int c=sc.nextInt();
//         int big=((a>b && a>c)?a:(b>c && b>a)?b:c);
//         int small=((a<b && a<c)?a:(b<c && b<a)?b:c);
//         int mid=(a+b+c)-(big+small);
//         System.out.println(small+" "+mid+" "+big);
//     }
// }



//write a program to find n^p

import java.util.Scanner;
class Ascending{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base value : ");
        int n=sc.nextInt();
        System.out.print("Enter power value : ");
        int p=sc.nextInt();
        int res=1;
        for(int i=1;;i++){
            // res=res*n;
            System.out.print(res+" ");
        }
    }
}



//write a java progam to reverse a number



// Error
// import java.util.Scanner;
// class Ascending{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter any 3 Number : ");
//         int num=sc.nextInt();
//         int res=0;
//         if(num!=0){
//             int rev=num%10;
//             res=(res*10)+rev;
//             num/=10;
//         }
//         System.out.println(res);
//     }
// }




