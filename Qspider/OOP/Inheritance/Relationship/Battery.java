public class Battery{
    int mgh;
    String type;
    int life;
    boolean waterproof;
    double watt; 

    Battery(){
        
    }

    Battery(int mgh,String type,int life,boolean waterproof,double watt){
        this.mgh=mgh;
        this.type=type;
        this.life=life;
        this.waterproof=waterproof;
        this.watt=watt;
    }

    public void displayBattery(){
        System.out.println();
        System.out.println("display Engine method");
        System.out.println("MGH : "+mgh);
        System.out.println("Battery Type : "+type);
        System.out.println("Battery life in hrs : "+50);
        System.out.println("Waterproof : "+true);
        System.out.println("Charger in watt : "+watt);
    }
}