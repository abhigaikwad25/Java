import java.util.Scanner;
class EvenOddAdd{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int n=sc.nextInt();
        int evenRes=0;
        int oddRes=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                evenRes+=i;
            }
            else{
                oddRes+=i;
            }
        }
        System.out.println("Sum of Even number : "+ evenRes);
        System.out.println("Sum of Odd number : "+ oddRes);
    }
}



//write a java prgramm to print the digits of a number





