///wriet a java program to find smallest and biggest digit from the number and check some smallest and biggest is single digit value or not
 
import java.util.Scanner;
class BigSmallNumber{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int n=sc.nextInt();
        int big=-9;
        int small=9;
        while(n!=0){
            int rem=n%10;
            if(rem>big){
                big=rem;
            }
            else if(rem<small){
                small=rem;
            }
            n=n/10;
        }
        System.out.println("Biggest number is : "+big);
        System.out.println("Biggest number is : "+small);
        if(big+small>=10){
            System.out.println("it is not simgle digit value");    
        }
        else{
            System.out.println("it is simgle digit value");
        }
        
    }
}