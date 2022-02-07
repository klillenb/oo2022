public class KorrutaKolmega {
	public static void main(String[] arg){

        //Koosta programm, mis
        //väljastaks kahe sisestatud arvu korrutise
		int arv1 = Integer.parseInt(arg[0]);
        int arv2 = Integer.parseInt(arg[1]);
        System.out.println(arv1*arv2);

        //Kirjutage kasutaja sisestatud
        //arv kordi "Tere"
        for(int i = 0; i < arv1; i++){
            System.out.println("Tere");
        }
	}
}