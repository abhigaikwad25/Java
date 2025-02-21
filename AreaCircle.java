import java.util.Scanner;
class AreaCircle{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Redius :- ");

        double r = sc.nextDouble();

        double area = (3.14 * r*r );
        System.out.println ("Area of circle is:-" + area);

        sc.close();

    }
}