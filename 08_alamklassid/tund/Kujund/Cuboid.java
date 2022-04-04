public class Cuboid extends Shape{
    double length, width;

    public Cuboid(double newLength, double newWidth, double newHeight){
        length = newLength; width = newWidth; height = newHeight;
    }

    @Override
    public double baseCircumference(){
        return length + width + length + width;
    }
}