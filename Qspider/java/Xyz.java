// write a java program to take four int from the user and find average of two number secound  two number and then again find the average of res;

//write a java program to take four integer from user and count how many even int are present and agaoin find out count is even or odd if count is even then print good else print bad

//write a java program to take three no from the user and fi d the last digits of all no then find the average of last digits
// import java.util.Scanner;

// class xyz{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter four Number ");
//         System.out.print("1st Number : ");
//         int num1=sc.nextInt();
//         System.out.print("2nd Number : ");
//         int num2=sc.nextInt();
//         System.out.print("3rd Number : ");
//         int num3=sc.nextInt();
//         System.out.print("4th Number : ");
//         int num4=sc.nextInt();

//         System.out.print((((num1+num2)/2)+((num3+num4)/2))/2);

//     }
// }



import java.util.Scanner;
import java.util.Arrays;

class xyz{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int arr[]=new int[4];
        int count=0;
        for(int i=0;i<4;i++){
            System.out.print("Enter "+ (i+1) + " Number :");
            int arrele=sc.nextInt();
            arr[i]=arrele;
        }
        for(int i=0;i<4;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        System.out.print("Even count is : "+ count);

    }

}