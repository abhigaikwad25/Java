import java.util.Scanner;
class passwordChecker{
    public static void main(String[] args) throws InterruptedException
    { 

        Scanner sc=new Scanner(System.in);
        int storePin=1234;
        int duration=5000;
        for(;;){
            int attempt=3;
            do{
                System.out.println();
                System.out.println("Enter your pin : ");
                int userPin=sc.nextInt();
                if(userPin==storePin){
                    System.out.println("Phone Unlocked");
                    break;
                }
                else{
                    System.out.println("Wrong pin");
                    System.out.println("attempt left "+ (attempt-1));
                    attempt--;
                }
            }while(attempt>=1);

            System.out.println("Your phone is locked for "+ (duration/1000)+" second");
            Thread.sleep(duration);
            duration*=2;
        }
    }
}