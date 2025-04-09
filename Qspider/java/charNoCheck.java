import java.util.Scanner;

class charNoCheck{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Char : ");
        char ch=sc.next().charAt(0);
        if(ch>='a'&& ch<='z' || ch>='A'&& ch<='Z'){
            System.out.println("Alphabet");
        }
        else if(ch>='0' && ch<='9'){
            System.out.println("Number");
        }
        else{
            System.out.println("Special Char");
        }
    }
}








