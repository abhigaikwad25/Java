import java.util.Scanner;
class Factorial{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int n=sc.nextInt();
        int res=1;
        for(int i=n;i>=1;i--){
            res=res*i;
        }
        System.out.println(res);
    }
}



//wriet a java program to find sum of odd and even number within n