// write a java programm to find sum of digits of given number
import java.util.Scanner;
class SeperateDigits{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int num=sc.nextInt();
        int sum=0;
        while(num!=0){
            int r=num%10;
            System.out.println(r);
            sum+=r;
            num=num/10;
        }
        System.out.println("Sum is : "+ sum);
    }
}



