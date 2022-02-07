public class Tervitus2 {
	public static void main(String[] arg){ //void e kättesaadav peale kompileerimist
        if(arg.length > 2){
		    System.out.println("Tere, " + arg[0] + " ja " + arg[1]);
            //arg[] on terminalis sisestatud nimi/väärtus
        }
        else if(arg.length > 0){
            System.out.println("Tere, "+arg[0]);
        }
        //Kui nimesid on vähemalt kaks,
        //siis tervitage kahte esimest nime
	}
}