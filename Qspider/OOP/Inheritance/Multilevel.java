class Surname{
    public static String surname="Gaikwad";
}

class Parent extends Surname{
    public static String pName="Nandlal";
    public static int pAge=30;
}

//Child Class
class Multilevel extends Parent{
    static String  cName="Abhijit";
    static int cAge=3;

    static void displayInfo(){
        System.out.println(cName + " " + pName + " " + surname);
        System.out.println("Parent Age : "+ pAge);
        System.out.println("Child Age : "+ cAge);
    }

    public static void main(String[] args){
        displayInfo();
    }
}