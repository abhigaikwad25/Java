//write a java program to find average of digits of number

import java.util.Scanner;
class AverageOfNum{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int n=sc.nextInt();
        int count=0;
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            count++;
            n=n/10;
        }
        System.out.println("Average of digits is : "+(sum/count));
        
    }
}
