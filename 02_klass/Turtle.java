public class Turtle{
    private int x, y, direction;
    // suund: 0 -> x++; 1 -> y ++; 2 -> x--; 3 -> y--;

    public String toString(){
        // return "(" + x +", " + y + ", suund " + direction + ")";
        return String.format("(%d, %d, suund %d)", x, y, direction);
    }

    public int askX(){return x;}
    public int askY(){return y;}

    public void forward(){
        if(direction == 0){x++;}
        if(direction == 1){y++;}
        if(direction == 2){x--;}
        if(direction == 3){y--;}
    }
    // Lisa funktsioon keera(), mis suurendab suunda ühe võrra
    // Kui ring on täis, alustatakse taas suunast 0
    public void turn(){
        if(direction < 3){direction++;}
        else{direction = 0;}
    }
}