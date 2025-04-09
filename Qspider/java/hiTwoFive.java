import java.util.Scanner;
    
class hiTwoFive{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num=sc.nextInt();

        if(num%2==0 && num%5==0){
            System.out.println("HIFIVE HITWO");
        }
        if(num%2==0 && num%5!=0){
            System.out.println("HITWO");
        }
        if(num%2!=0 && num%5==0){
            System.out.println("HIFIVE ");
        }
        else{

        }
    }        

}