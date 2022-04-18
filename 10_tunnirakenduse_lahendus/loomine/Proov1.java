public class Proov1 {
    public static void main(String[] arg){
        SamaTyypiPaar<Integer> asukoht = new SamaTyypiPaar<>();
        asukoht.esimene = 7;
        asukoht.teine = 4;
        System.out.println(asukoht.esimene);
        System.out.println(asukoht);

        Nimi<String> nimed = new Nimi<>();
        nimed.eesnimi = "Maali";
        nimed.perekonnanimi = "Maasikas";
        System.out.println(nimed);
    }
}