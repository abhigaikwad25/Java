class Customer{
    private String name;
    private String address;
    private String email;
    private long contact;
    private long adhar;
    private String pan;
    private double bal;
    private int pin;
    private static String ifscCode="HTB000123";
    private long accNum;
    
    Customer(){
        super();
    }

    Customer(String name,String address,String email,long contact,long adhar,String pan,double bal,int pin){
        this.name=name;
        this.address=address;
        this.email=email;
        this.contact=contact;
        this.adhar=adhar;
        this.pan=pan;
        this.bal=bal;
        this.pin=pin;
        this.accNum=(long)(Math.random()*1000000000000l);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name=newName;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String newAddress){
        this.name=newAddress;
    }

    public String getEmail(){
        return this.address;
    }

    public void setEmail(String newEmail){
        this.name=newEmail;
    }

    public long getContact(){
        return this.contact;
    }

    public void setContact(long newContact){
        this.contact=newContact;
    }

    public long getadhar(){
        return this.adhar;
    }

    public void setAdhar(long newAdhar){
        this.adhar=newAdhar;
    }

    public String getPan(){
        return this.pan;
    }

    public void setPan(String newPan){
        this.pan=newPan;
    }

    public double getBal(){
        return this.bal;
    }

    public void setBal(double newBal){
        this.bal=newBal;
    }

    public int getPin(){
        return this.pin;
    }

    public void setPin(int newPin){
        this.pin=newPin;
    }

    public long getAccNum(long accNum){
        return this.accNum;
    }

}