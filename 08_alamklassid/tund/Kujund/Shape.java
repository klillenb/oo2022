public abstract class Shape{
    double height;
    public abstract double baseCircumference();
    public double sideSurface(){
        return baseCircumference() * height;
    }
}