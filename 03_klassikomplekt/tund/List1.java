import java.util.*;

public class List1{
    public static void main(String[] arg){
        List<String> names = new ArrayList<String>();
        names.add("Juku");
        names.add("Mati");
        names.add("Kati");
        System.out.println(names.get(1));
        System.out.println(names.size());

        for(String name: names){
            System.out.println(name);
        }
    }
}