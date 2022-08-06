public class Circle
{
    private double Radius;
    
    public Circle()
    {
        Radius=1;
    }
    
    public Circle(double Radius)
    {
        this.Radius = Radius;
    }
    
    public double getArea()
    {
        return (3.14*Radius*Radius);
    }
    
    public double getPerimeter()
    {
        return (2*3.14*Radius);
    }
}

