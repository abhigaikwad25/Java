
//write a java programm to print even digits fro the number

import java.util.Scanner;
class EvenDigitOfNum{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int num=sc.nextInt();
        int sum=0;
        while(num!=0){
            int r=num%10;
            if(r%2==0){
                System.out.println(r);
            }
            num=num/10;
        }
        System.out.println("Sum is : "+ sum);
    }
}