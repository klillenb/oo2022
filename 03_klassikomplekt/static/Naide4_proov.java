public class Naide4_proov{
    public static void main(String[] arg){
        Naide4 a = new Naide4(2);
        Naide4 b = new Naide4(3);
        System.out.println(a.korruta(7));
        System.out.println(a.korruta(8));
        System.out.println(b.korruta(9));
        System.out.println(a.mituKordaEksemplariKaivitatud());
        System.out.println(b.mituKordaEksemplariKaivitatud());
        System.out.println(Naide4.mituKordaKlassisKaivitatud());
        System.out.println(Naide4.korruta(8, 7));
    }
}