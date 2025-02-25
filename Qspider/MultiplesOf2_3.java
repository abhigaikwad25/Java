
//Write a java programm to find sum of multiples of 3 and 2 with in n



import java.util.Scanner;
class MultiplesOf2_3{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int n=sc.nextInt();
        int multi_2=0;
        int multi_3=0;
        for(int i=1;i<n;i++){
            if(i%2==0){
                multi_2+=i;
            }
            if(i%3==0){
                System.out.println(i);
                multi_3+=i;
            }
        }
        System.out.println("Sum of Multiple of 2 : "+ multi_2);
        System.out.println("Sum of Multiple of 3 : "+ multi_3);
    }
}



// calculate the multiple of any number