import java.util.Scanner;

public class Kell{
    public static void main(String[] arg){
        Scanner reader = new Scanner(System.in);
        System.out.print("Sisesta pendli pikkus: ");
        Double pikkus = reader.nextDouble();

        Double vonge = Pendel.vonkeperiood(pikkus);
        while(true){
            Pendel.tiksumine(vonge);

        }
    }
}