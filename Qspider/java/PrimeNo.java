import java.util.Scanner;

class PrimeNo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Range : ");
        int num=sc.nextInt();
        boolean cnt=false;
        for(int i=2;i<=num;i++){
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    cnt=true;
                    break;
                }
            }
            if(cnt==false){
                System.out.print(i+ " ");
            }
            cnt=false;
        }
    }
}


