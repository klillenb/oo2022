class Punkt3D extends Punkt2D{
    double z;
    
    public Punkt3D(double uus_x, double uus_y, double uus_z){
        x = uus_x; y = uus_y; z = uus_z;
    }

    public double kaugusNullist3D(){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

}