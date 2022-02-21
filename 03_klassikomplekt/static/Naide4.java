public class Naide4{
    private int kordaja;
    private int eksemplariLoendur = 0;
    private static int klassiLoendur;

    public Naide4(int uusKordaja){
        kordaja = uusKordaja;
    }

    int korruta(int arv){
        eksemplariLoendur++;
        klassiLoendur++;
        return kordaja * arv;
    }

    int mituKordaEksemplariKaivitatud(){
        return eksemplariLoendur;
    }

    static int mituKordaKlassisKaivitatud(){
        return klassiLoendur;
    }

    static int korruta(int arv, int millega){
        klassiLoendur++;
        return arv * millega;
    }
}