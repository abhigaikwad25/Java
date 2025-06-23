class MainCallStatic{
    static boolean flag=false;
    static{
        System.out.println("Static Block");
        flag=false;
        main(new String[10]);
        flag=true;
    }
    public static void main(String[] args){
        if(flag){
            System.out.println("Call by JVM");
        }
        else{
            System.out.println("Call by programer");
        }
    }
}