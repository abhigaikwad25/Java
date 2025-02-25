//write a java programm to print sum of even and odd digits from the number
import java.util.Scanner;
class OddDigitOfNum{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int num=sc.nextInt();
        while(num!=0){
            int r=num%10;
            if(r%2==0){
                System.out.println("Even No : "+r);
            }
            else{
                System.out.println("Odd No : "+r);
            }
            num=num/10;
        }
    }
}