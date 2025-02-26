
//write a program to check whether a number is perfect number or not
import java.util.Scanner;
class perfectNumber{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int n=sc.nextInt();
        int res=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                res+=i;
            }
        }
        System.out.println(res);
        if(res==n){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not perfect Number");
        }
    }
}




// 

