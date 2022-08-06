import java.util.Scanner;

public class MethodOverloadingMain
{
    //ID - 21CE142
    //Name - Krishna M. Thakor
    //Aim - Develop a Program that illustrate method overloading concept.
    
    public static void main(String args[])
    {
        Scanner sobj =new Scanner(System.in);
        int side1,side2,side3;
        
        System.out.print("Enter Length [3 sides] : " );
        
        side1= sobj.nextInt();
        side2=sobj.nextInt();
        side3=sobj.nextInt();
       
        MethodOverloading mobj = new MethodOverloading();
        
        mobj.setSide1(side1);
        mobj.setSide2(side2);
        mobj.setSide3(side3);

        MethodOverloading pobj2 = new MethodOverloading(side1,side2,side3);
        
        System.out.println();
        System.out.println("ID : 21CE142\nName : Krishna M. Thakor");
    }
}

