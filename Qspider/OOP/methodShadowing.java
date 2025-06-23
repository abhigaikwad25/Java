class Account{
    public static void accInfo(){
        System.out.println("Saving Account");
    }
}

class CurrAccount extends Account{
    public static void accInfo(){
        System.out.println("Current Account");
    }
}


class methodShadowing{
    public static void main(String[] args){
        CurrAccount obj1=new CurrAccount();
        obj1.accInfo();

        Account obj2=new CurrAccount();
        obj2.accInfo();

        Account obj3=new Account();
        obj3.accInfo();

        Account obj4=(Account)obj2;
        obj4.accInfo();
    }
}