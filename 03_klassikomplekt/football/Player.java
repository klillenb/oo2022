public class Player{
    String lastName;
    double x, y, angleRad, speed;
    
    public Player(String newLastName, double newX, double newY, double newAngleDegree, double newSpeed){
        lastName = newLastName; x = newX; y = newY;
        angleRad = Math.toRadians(newAngleDegree);
        speed = newSpeed;
    }

    public String toString(){
        return lastName + " (" + x + ", " + y + ") " + Math.round(Math.toDegrees(angleRad)) + " kraadi "
        + speed + " m/s";
    }

    public void move(double sec){
        x += sec * speed * Math.cos(angleRad);
        y += sec * speed * Math.sin(angleRad);
    }

    public double distance(double ux, double uy){
        double dx = ux - x; double dy = uy - y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}