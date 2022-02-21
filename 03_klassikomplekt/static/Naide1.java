//Tunnis selgitatud static näide
//static method saab kätte ilma et peaks objekti looma

class Naide1{
    static int loendur = 0;
    static int korrutaKahega(int arv){
        loendur++;
        return arv * 2;
    }

    public static void main(String[] arg){
        System.out.println(loendur); //Kui ei oleks static keyword eelnevalt ees, siis ei saaks muutujat kätte
        System.out.println(korrutaKahega(5)); // Kui ei oleks static keyword eelnevalt ees, siis method annaks errori
        System.out.println(loendur);
        System.out.println(korrutaKahega(11));
        System.out.println(loendur);
    }
}