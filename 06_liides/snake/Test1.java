import java.util.*;
import java.io.*;

public class Test1{
    public static void main(String[] arg) throws IOException{
        GameCore gc = new GameCore1();
        gc.foodRandomCoord();
        System.out.println(Arrays.toString(gc.foodCoord()));
        //System.out.println(Arrays.toString(gc.foodCoord()));
        gc.right();
        gc.step();
        gc.step();
        System.out.println(Arrays.deepToString(gc.snakeCoords()));
        new CoreStarter(gc);
        //Hoidke GameCore1 klassis meeles ussi pea koht
        //Võimaldage käskudega liigutada
        //Kuvage küsimisel tulemus

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String row = br.readLine();
            if(row.length() > 0){
                if(row.charAt(0) == 'l'){gc.left();}
                if(row.charAt(0) == 'r'){gc.right();}
                if(row.charAt(0) == 'u'){gc.up();}
                if(row.charAt(0) == 'd'){gc.down();}
            }
        }
    }
}