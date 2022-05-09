import java.util.Objects;

public class Geen {
    Alleel alleel1;
    Alleel alleel2;

    public Geen(Alleel alleel1, Alleel alleel2) {
        this.alleel1 = alleel1;
        this.alleel2 = alleel2;
    }


    public boolean onOlemas(){
        if(alleel1.nimetus.equals(alleel2.nimetus)){
            if(alleel1.dominantne || alleel2.dominantne){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public Alleel valjastaJuhuslik(){
        int min = 1;
        int max = 2;

        int random = (int)Math.floor(Math.random() * (max - min + 1) + min);
        if(Objects.equals(random, 1)){
            return alleel1;
        } else {
            return alleel2;
        }
    }

    public Geen looUusGeen(Geen geen1, Geen geen2){
        Alleel alleel1 = geen1.valjastaJuhuslik();
        Alleel alleel2 = geen2.valjastaJuhuslik();
        return new Geen(alleel1, alleel2);
    }

    @Override
    public String toString() {
        return "Geen{" + "\n" +
                "alleel1=" + alleel1.toString() + "\n" +
                "alleel2=" + alleel2.toString() + "\n" +
                '}';
    }
}
