public class Test1{
    public static double sideSurfaceSum(Shape[] arr){
        double sum = 0;
        for(Shape s: arr){sum += s.sideSurface();}
        return sum;
    }
    public static void main(String[] arg){
        Shape[] sh = new Shape[3];
        sh[0] = new Cuboid(2, 3, 4);
        System.out.println(sh[0].sideSurface());
        sh[1] = new Cylinder(2, 5);
        System.out.println(sh[1].sideSurface());
    }
}