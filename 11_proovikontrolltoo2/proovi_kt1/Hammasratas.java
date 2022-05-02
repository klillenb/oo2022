import ajva.util.*;

public class Hammasratas{
    Integer rattaArv;
    Integer loendur = 0;
    Integer rattaRing = 1;

    public void setRattaArv(Integer rattaArv) {
        this.rattaArv = rattaArv;
    }
    
    public void loendur(){
        loendur++;
        //System.out.println(loendur + " " + rattaArv);
        if(loendur.equals(rattaArv)){
            rattaRing += 1;
            loendur = 0;
            System.out.println("Mitmes ring: " + rattaRing);
        }
    }
}