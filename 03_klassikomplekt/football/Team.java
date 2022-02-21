import java.util.*;

public class Team{
    List<Player> players = new ArrayList<Player>();
    String teamName;

    public Team(String newTeamName){teamName = newTeamName;}

    public void addPlayer(Player p){players.add(p);}

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(teamName + "\n");
        for(Player p: players){
            sb.append(p + "\n");
        }
        return sb.toString();
    }

    public void move(double sec){
        for(Player p: players){
            p.move(sec);
        }
    }

    public Player closest(double px, double py){
        //Eeldan, et esimene mängija on lähim
        //Vaatan kõik mängijad läbi
        //Kui leian lähema mängija, määran tema lähimaks
        //Tagastan funktsioonist mängija
        Player v = players.get(0);
        for(Player p: players){
            if(p.distance(px, py) < v.distance(px, py)){
                v = p;
            }
        }
        return v;
    }
}