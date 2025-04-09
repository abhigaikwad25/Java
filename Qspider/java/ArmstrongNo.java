//armstrong number for 3 digit

// import java.util.Scanner;
// class Armstron{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter 3 digit Number only : ");
//         int num=sc.nextInt();
//         int dup=num;
//         int finalRes=0;
//         while(num!=0){
//             int rem=num%10;
//             int res=1;
//             for(int i=0;i<3;i++){
//                 res=res*rem;
//             }
//             finalRes+=res;
//             num/=10;
//         }
//         System.out.println(finalRes);
//         if(finalRes==dup)
//             System.out.println("Armstrong number");
//         else
//             System.out.println("Not Armstrong number");
//     }
// }







///Armstrong number code for any number of digits
import java.util.Scanner;
class ArmstrongNo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any number : ");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        int count=0;
        while(temp>0){
            int rem=temp%10;
            count++;
            temp/=10;
        }
        temp=num;
        while(temp>0){
            int rem=temp%10;
            sum+=Math.pow(rem,count);
            temp/=10;
        }

        if(num==sum){
            System.out.println("Armstrong No");
        }
        else{
            System.out.println("Not Armstrong No");
        }
    }
}
