public class Mobile{

    String brand;
    int camera_mp;
    int price;
    Battery b=new Battery(6000,"Lithenium",50,true,120);

    Mobile(){
        
    }

    Mobile(String brand,int camera_mp,int price){
        this.brand=brand;
        this.camera_mp=camera_mp;
        this.price=price;
        
    }

    public void displayMobile(){
        System.out.println("Display Car method");

        System.out.println("Brand : "+ brand);
        System.out.println("Camera MP : "+ camera_mp);
        System.out.println("Price : "+ price); 
    }
}
