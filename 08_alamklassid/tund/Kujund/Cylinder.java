public class Cylinder extends Shape{
    double radius;

    public Cylinder(double newRadius, double newHeight){
        radius = newRadius;
        height = newHeight;
    }

    @Override
    public double baseCircumference(){
        return Math.PI * Math.pow(radius, 2);
    }
}