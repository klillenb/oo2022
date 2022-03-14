public class GameCore1 implements GameCore{
    int foodX, foodY, snakeX, snakeY;
    final int width = 10, height = 10;
    char direction = 'u';

    public void left(){direction = 'l';}
    public void right(){direction = 'r';}
    public void up(){direction = 'u';}
    public void down(){direction = 'd';}

    public void step(){
        if(direction == 'l'){snakeX--;}
        if(direction == 'r'){snakeX++;}
        if(direction == 'u'){snakeY++;}
        if(direction == 'd'){snakeY--;}
        //Kui olen jõudnud õunani, siis viska õun uude juhuslikku kohta
        if(snakeX == foodX && snakeY == foodY){
            foodRandomCoord();
        }
    }

    public int[][] snakeCoords(){return new int[][]{{snakeX, snakeY}};}

    public int[] foodCoord(){
        return new int[]{foodX, foodY};
    }

    public void foodRandomCoord(){
        foodX = (int)(width * Math.random());
        foodY = (int)(height * Math.random()); 
    }

    
    
}