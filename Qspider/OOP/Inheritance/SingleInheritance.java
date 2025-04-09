class Parent{
    public static String pName="Nandlal";
    public static String surname="Gaikwad";
    public static int pAge=30;
}

//Child Class
class SingleInheritance extends Parent{
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