public class MethodOverloading
{
    private int side1,side2,side3;
    
    public int getSide1() 
    {
        return side1;
    }
    
    public void setSide1(int side1)     
    {
        this.side1 = side1;
    }
    
    public int getSide2() 
    {
        return side2;
    }
    
    public void setSide2(int side2) 
    {
        this.side2 = side2;
    }
    
    public int getSide3() 
    {
        return side3;
    }
    
    public void setSide3(int side3) 
    {
        this.side3 = side3;
    }
    
    public MethodOverloading()
    {
        System.out.println("\nDefault Constructor Called!");
    }
    
    public MethodOverloading(int side1)
    {
        this.side1 = side1;
        
        System.out.println("\nParameterized Constructor with One Parameter.");
        float perimeter;
        perimeter = (float) (2 * 3.14 * side1);
        System.out.println("Perimeter of Circle : " + perimeter + " cm.");
    }
    
    public MethodOverloading(int side1,int side2)
    {
        this(side1);
        this.side2 = side2;
        
        System.out.println("\nParameterized Constructor with Two Parameters.");
        int perimeter;
        perimeter=2*(side1+side2);
        System.out.println("Perimeter of Rectangle : " + perimeter + " cm.");
    }
    
    public MethodOverloading(int side1,int side2,int side3)
    {
        this(side1,side2);
        this.side3 = side3;
    
        System.out.println("\nParameterized Constructor with Three Parameters.");
        int perimeter;
        perimeter=side1+side2+side3;
        System.out.println("Perimeter of Triangle : " + perimeter + " cm.");
    }
}
