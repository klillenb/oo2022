package pr1;

public class MyCore implements GameCore{
    int snakeX, snakeY;
    char direction = 'u';
    int[][] places = {{snakeX, snakeY}};

    public void left(){}
    public void right(){direction = 'r';}
    public void up(){}
    public void down(){}
    public void step(){
        if (direction == 'r'){places[0][0]++;}
    }
    public int[] foodCoord(){return null;}
    public int[][] snakeCoords(){
        return places;
    }
    public void foodRandomCoord(){}

}