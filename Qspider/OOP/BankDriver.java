import java.util.Scanner;
import java.util.ArrayList;

class bankDriver{

    static Customer cust;
    static ArrayList<String> statment=new ArrayList<String>();

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        for( ; ; ){
            System.out.println("=====================================");
            System.out.println("        ******* WELCOME *******");
            System.out.println("             Heritage Bank");
            System.out.println();
            System.out.println("1. Login");
            System.out.println("2. Create account");
            System.out.println(" ");
            System.out.print("Enter any one option : ");
            System.out.println("=======================================");
            int opt=sc.nextInt();
            switch(opt){
                case 1: login(sc); break;
                case 2: createAcc(sc); break;
                default: System.out.println("Invalid Option"); break;
            }
        }
    }

    public static void login(Scanner sc){
        if(cust == null){
            System.out.println("Create your acccount first");
            return ;
        }

        System.out.println("LOGIN");

        for(int i=3;i>=1;i++){
            System.out.print("Phone : ");
            long userPhone=sc.nextLong();
            System.out.print("Pin : ");
            int userPin=sc.nextInt();

            if(cust.getPin()==userPin){
                homePage(sc);
            }
            else{
                System.out.println("Invalid pin");
                System.out.println("Attempt left "  +(i-1));
            }
        }
        System.out.println("Your account is blocked for 24 hours");
        System.exit(0);
    }


    public static void createAcc(Scanner sc){
        System.out.println("===========================================");
        System.out.println("CREATE ACCOUNT");
        System.out.println();
        sc.nextLine();
        System.out.print("Enter Name : ");
        String name=sc.nextLine();

        System.out.print("Enter Email : ");
        String email=sc.next();
        sc.nextLine();

        System.out.print("Enter Address : ");
        String address=sc.nextLine();

        System.out.print("Enter Contact no : ");
        long contact=sc.nextLong();

        System.out.print("Enter Addhar : ");
        long adhar=sc.nextLong();

        System.out.print("Enter pan no : ");
        String pan=sc.next();

        System.out.print("Deposit Amount: ");
        double amount=sc.nextDouble();
        statment.add("Deposit : "+ amount);
        
        System.out.print("Enter Pin : ");
        int pin=sc.nextInt();

        cust=new Customer(name,address,email,contact,adhar,pan,amount,pin);

        System.out.println("ACCOUNT CREATED SUCCESSFULLY");
        System.out.println();
    
    }

    public static void homePage(Scanner sc){
        for( ; ; ){
            System.out.println("======================================");
            System.out.println("   HOME PAGE  ");
            System.out.println();
            
            System.out.println("1. Deposit Amount");
            System.out.println("2. withdraw Amount");
            System.out.println("3. Check balance");
            System.out.println("4. Statment");
            System.out.println("5. Show profile");
            System.out.println("6. Edit profile");
            System.out.println("7. logout");
            System.out.println("======================================");

            System.out.print("Enter option : ");
            int opt=sc.nextInt();
            System.out.println();
            switch(opt){
                case 1: depositAmount(sc); break;
                case 2: withdrawAmount(sc); break;
                case 3: checkBal(sc); break;
                case 4: statment(sc); break;
                case 5: displayAccInfo(sc); break;
                case 6: editProfile(sc); break;
                case 7: 
                    System.out.println("thank you visit again");
                    System.exit(0);
                default: 
                    System.out.println("Invalid Option");
            }
        }
    }

    public static void depositAmount(Scanner sc){
        System.out.println("===========================================");
        System.out.println("DEPOSIT");
        System.out.println();
        System.out.print("Enter Amount : ");
        double depAmt=sc.nextDouble();
        cust.setBal(depAmt+cust.getBal());
        System.out.println("*** Amount Deposit Successfully ***");
        statment.add("Deposit : "+ depAmt);
    }

    public static void withdrawAmount(Scanner sc){
        System.out.println("===========================================");
        System.out.println("WITHDRAW");
        System.out.println();
        System.out.print("Enter Amount : ");
        double wAmt=sc.nextDouble();
        System.out.print("Enter pin :");
        int userPin=sc.nextInt();

        if(userPin==cust.getPin()){
            if(wAmt<=cust.getBal()){
                double newBal=cust.getBal()-wAmt;
                cust.setBal(newBal);
                System.out.println("*** Withdraw Successfully ***");
                statment.add("Withdraw : "+ wAmt);
            }
            else{
                System.out.println("Insufficient Bal");
            }
        }
        else{
            System.out.println("Invalid pin");
        }
    }

    public static void checkBal(Scanner sc){
        System.out.println("======================================");
        System.out.println("CHECK BALANCE");
        
        
        System.out.print("Enter pin :");
        int userPin=sc.nextInt();

        if(userPin==cust.getPin()){
            System.out.println("Your Balance : "+cust.getBal());
        }
        else{
            System.out.println("Invalid pin");
        }
    }

    public static void statment(Scanner sc){
        System.out.println("======================================");
        System.out.println("ACCOUNT STATMENT");
        System.out.println();

        for(String str : statment){
            System.out.println(str);
        }
        System.out.println();
        System.out.println("Available Balance : "+cust.getBal());
    }

    public static void editProfile(Scanner sc){
        System.out.println("======================================");
        
        System.out.println("*** EDIT PROFILE ***");
        System.out.println();
        
        System.out.print("Pin : ");
        int userPin=sc.nextInt();

        if(cust.getPin()==userPin){
            // for( ; ; ){
                System.out.println("1. Edit Name");
                System.out.println("2. Edit Email");
                System.out.println("3. Edit Address");
                System.out.println("4. Edit contact");
                System.out.println();
                System.out.println("Select which you want to edit");
                int opt1=sc.nextInt();
                sc.nextLine();

                switch(opt1){
                    case 1: editName(sc); break;
                    case 2: editEmail(sc); break;
                    case 3: editAddress(sc); break;
                    case 4: editContact(sc); break;
                    default: 
                        System.out.println("Invalid Option");
                        break;
                }
                // System.exit(0);
            
            // }
            
        }
        else{
            System.out.println("Invalid pin");
        }
    }

    public static void editName(Scanner sc){
        System.out.print("Enter new Name : ");
        String newName=sc.nextLine();
        cust.setName(newName);
        System.out.println("Name updated successfully.");
    }

    public static void editEmail(Scanner sc){
        System.out.print("Enter new Email : ");
        String newEmail=sc.nextLine();
        cust.setEmail(newEmail);
        System.out.println("Email updated successfully.");
    }

    public static void editAddress(Scanner sc){
        System.out.print("Enter new Address : ");
        String newAddress=sc.nextLine();
        cust.setAddress(newAddress);
        System.out.println("Address updated successfully.");
    }

    public static void editContact(Scanner sc){
        System.out.print("Enter new Contact : ");
        long newContact=sc.nextLong();
        cust.setContact(newContact);
        System.out.println("Contact updated successfully.");
    }

    public static void displayAccInfo(Scanner sc){
        System.out.print("Pin : ");
        int userPin=sc.nextInt();

        if(cust.getPin()==userPin){
            System.out.println("=================================");
            System.out.println("*** ACCOUNT INFO ***");
            System.out.println("=================================");

            // System.out.println("Account No. : "+cust.getAccNum());
            System.out.println("Name : "+cust.getName());
            System.out.println("Email : "+cust.getEmail());
            System.out.println("Address : "+cust.getAddress());
            System.out.println("Contact : "+cust.getContact());
            System.out.println("Aadhar : "+cust.getadhar());
            System.out.println("Pan No : "+cust.getPan());

        }
        else{
            System.out.println("Invalid pin");
        }

    }
}