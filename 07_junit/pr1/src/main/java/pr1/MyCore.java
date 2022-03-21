package pr1;

public class MyCore implements GameCore{
    int snakeX, snakeY, foodX, foodY;
    char direction = 'u';
    int[][] places = {{snakeX, snakeY}};

    public void left(){direction = 'l';}
    public void right(){direction = 'r';}
    public void up(){direction = 'u';}
    public void down(){direction = 'd';}
    public void step(){
        if(direction == 'r'){places[0][0]++;}
        if(direction == 'l'){places[0][0]--;}
        if(direction == 'u'){places[0][1]++;}
        if(direction == 'd'){places[0][1]--;}
    }
    public int[] foodCoord(){return new int[]{foodX, foodY};}
    public void foodCoord(int[] c1){
        foodX = c1[0];
        foodY = c1[1];
    }
    public int[][] snakeCoords(){
        return places;
    }
    public void foodRandomCoord(){}
    public boolean hasHit(){
        if(snakeX == foodX && snakeY == foodY){
            return true;
        } else {
            return false;
        }
    }

}