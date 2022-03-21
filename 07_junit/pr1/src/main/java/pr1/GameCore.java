package pr1;

public interface GameCore{
    public void left();
    public void right();
    public void up();
    public void down();
    public void step();
    public int[][] snakeCoords();
    public int[] foodCoord();
    public void foodRandomCoord();
}