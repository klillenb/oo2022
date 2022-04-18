import java.util.*;

public class Proov2 {
    public static void main(String[] arg){
        Map<Integer, String> valvajad = new HashMap<>();
        valvajad.put(1, "Juku");
        valvajad.put(2, "Kati");
        valvajad.put(3, "Mati");
        System.out.println(valvajad);

        Map<String, Integer> mataHinne = new HashMap<>();
        mataHinne.put("Juku", 4);
        mataHinne.put("Mati", 3);
        mataHinne.put("Maali", 5);
        System.out.println(mataHinne);
    }
}