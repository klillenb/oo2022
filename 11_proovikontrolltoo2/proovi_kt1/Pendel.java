import java.util.*;

public class Pendel {
    public static double vonkeperiood(double pikkus){
        return 2 * Math.PI * Math.sqrt(pikkus / 9.8);
    }

    static Hammasratas h1 = new Hammasratas();
    static Hammasratas h2 = new Hammasratas();
    static Hammasratas h3 = new Hammasratas();
    static{
        h1.setRattaArv(10);
        h2.setRattaArv(20);
        h3.setRattaArv(30);
    }

    public static void tiksumine(double vonge){
        try {
            Thread.sleep((int)vonge * 1000);
            System.out.println("Tiks");
            h1.loendur();
            if(h1.)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}