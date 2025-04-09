// import java.util.Scanner;
// class abc{
//     public static void main(String [] args){
//         for (int i=0;i<=100;i++){
//             System.out.println(i);
//         }
//         System.out.println();
//         for(char i='A';i<='Z';i++){
//             System.out.print(i+ " ");
//         }
//         System.out.println();
//         for(char i='a';i<='z';i++){
//             System.out.print(i+ " ");
//         }

        
//     }
// }





// to check user entered no is divisible by 3 and 5 or not
// import java.util.Scanner;

// class abc{
//     public static void main(String [] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a Number : ");
//         int num=sc.nextInt();
//         if(num%3==0 && num%5==0){
//             System.out.println("Divisible by 3 and 5");
//         }
//         else{
//             System.out.println("Not Divisible by 3 and 5");
//         }
//     }
// }




//Armstrong Number
class abc{
    public static void main(String[] args){
        int num=153;
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

