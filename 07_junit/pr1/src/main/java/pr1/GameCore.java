package pr1;

public interface GameCore{
    public void left();
    public void right();
    public void up();
    public void down();
    public void step();
    public int[][] snakeCoords();
    public int[] foodCoord();
    public void foodCoord(int[] place);
    public void foodRandomCoord();

    //Lisage funktsioon kasPihtas() näitamaks, kas ussi pea tabas õuna
    //ja lisage test kontrollimas, kas kasPihtas() töötab õigesti
    public boolean hasHit();
}