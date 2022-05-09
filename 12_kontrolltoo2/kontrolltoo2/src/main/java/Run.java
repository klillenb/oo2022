import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Run {

    public static void main(String[] args){

        ArrayList<String> alleelid = new ArrayList<String>();
        alleelid.add("reesus");
        alleelid.add("sirged juuksed");
        alleelid.add("veregrupp A");
        alleelid.add("veregrupp B");

        Alleel vanem1a1 = new Alleel(alleelid.get(0), true);
        Alleel vanem1a2 = new Alleel(alleelid.get(0), false);
        Alleel vanem2a1 = new Alleel(alleelid.get(2), false);
        Alleel vanem2a2 = new Alleel(alleelid.get(2), true);

        Geen vanem1 = new Geen(vanem1a1, vanem1a2);
        Geen vanem2 = new Geen(vanem2a1, vanem2a2);

        Map<Geen, String> geenid = Map.of(vanem1, "Mati", vanem2, "Kati");

        if(vanem1.onOlemas() && vanem2.onOlemas()) {
            Geen laps = vanem1.looUusGeen(vanem1, vanem2);
            try {
                PrintWriter kirjutaja = new PrintWriter(new FileWriter("lapse_geenid.txt", true));
                kirjutaja.println(laps.toString());
                kirjutaja.close();
            } catch (IOException e) {
                System.out.println("Tekkis viga: ");
                e.printStackTrace();
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sisesta otsitav geen: ");
        String geeniNimi1 = scanner.nextLine();
        if(alleelid.contains(geeniNimi1)){
            System.out.print("Sisesta teine geen: ");
            String geeniNimi2 = scanner.nextLine();
            if(alleelid.contains(geeniNimi2)){
                System.out.println("Otsitavad geenid on isikutel: ");
                for(Geen vanem : geenid.keySet()){
                    if(vanem.alleel1.equals(geeniNimi1) || vanem.alleel2.equals(geeniNimi1)
                            || vanem.alleel1.equals(geeniNimi2) || vanem.alleel2.equals(geeniNimi2)){
                        System.out.println("nimi: " + vanem);
                    }
                }
            }
        } else {
            System.out.println("Otsitavat geeni ei ole nimekirjas!");
        }
    }
}
