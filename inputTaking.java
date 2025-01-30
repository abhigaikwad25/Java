import java.util.Scanner;

public class inputTaking{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any string : ");
        String str=sc.next();         //taking input as string but store only first element of string          
        String str2=sc.nextLine();         //return full string          
        // System.out.println("String : "+str);
        System.out.println("String : "+str2);

        System.out.println("Enter any number : ");
        int num=sc.nextInt();
        System.out.println("Number : "+num);
    }
}