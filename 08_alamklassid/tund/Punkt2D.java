class Punkt2D{
    double x, y;

    public Punkt2D(){
        this(0.0, 0.0);
    }

    public Punkt2D(double uus_x, double uus_y){
        x = uus_x;
        y = uus_y;
    }

    public String kirjutaAndmed(){
        return "x = " + x + "; y = " + y;
    }

    public double kaugusNullist2D(){
        return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
    }
}
