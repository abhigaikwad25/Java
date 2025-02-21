import java.util.Scanner;
class specialNo{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Any number :- ");
        int num=sc.nextInt();
        int div=num/10;
        int mod=num%10;
        int res=(div+mod)+(div*mod);
        if (res==num){
            System.out.print("Special No");
        }
        else{
            System.out.print("Not Special No");
        }
    }
}