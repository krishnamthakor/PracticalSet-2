import java.util.Scanner;

public class CircleMain
{
    //ID - 21CE142
    //Name - Krishna M. Thakor
    //Aim - Design a class named Circle containing various attributes and behavior as mentioned.
    
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        Circle cobj1= new Circle();
        
        double Radius;
        System.out.print("Enter Radius of Circle[in cm] : ");
        Radius = sobj.nextDouble();
        
        Circle cobj2 = new Circle(Radius);
        
        System.out.println("Area of Circle : " + cobj2.getArea() + " cm^2.");
        System.out.println("Perimeter of Circle : " + cobj2.getPerimeter() + " cm.");
        sobj.close();
        
        System.out.println();
        System.out.println("ID : 21CE142\nName : Krishna M. Thakor");
    }
}
