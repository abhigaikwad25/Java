

//wriet a java program to find biggest digit from number


import java.util.Scanner;
class LowestNumber{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int n=sc.nextInt();
        int big=9;
        while(n!=0){
            int rem=n%10;
            if(rem<big){
                big=rem;
            }
            n=n/10;
        }
        System.out.println("Lowest number is : "+big);
        
    }
}







