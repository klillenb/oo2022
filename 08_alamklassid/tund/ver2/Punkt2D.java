class Punkt2D{
    double x, y;

    public Punkt2D(double uus_x, double uus_y){
        x = uus_x;
        y = uus_y;
    }

    public double kaugusNullist2D(){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}
