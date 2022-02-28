public class Polygon{
    double[] xCoords = new double[3];
    double[] yCoords = new double[3];

    public Polygon(double x1, double y1, double x2, double y2, double x3, double y3){
        xCoords[0] = x1; xCoords[1] = x2; xCoords[2] = x3;
        yCoords[0] = y1; yCoords[1] = y2; yCoords[2] = y3;
    }

    public void print(){
        for(int i = 0; i < xCoords.length; i++){
            System.out.println(xCoords[i] + " " + yCoords[i]);
        }
    }

    public double perimeter(){
        double ab, bc, ac;
        ab = Math.sqrt(Math.pow(xCoords[1] - xCoords[0], 2) + Math.pow(yCoords[1] - yCoords[0], 2));
        bc = Math.sqrt(Math.pow(xCoords[2] - xCoords[1], 2) + Math.pow(yCoords[2] - yCoords[1], 2));
        ac = Math.sqrt(Math.pow(xCoords[2] - xCoords[0], 2) + Math.pow(yCoords[2] - yCoords[0], 2));

        return ab + bc + ac;
    }
}