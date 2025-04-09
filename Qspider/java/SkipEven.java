//Skip even number

import java.util.Scanner;
class SkipEven{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}