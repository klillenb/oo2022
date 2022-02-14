import java.util.Scanner;
import java.util.Random;

public class NewtonMethod{
    public static double sqrt(int number){
        double EPSILON = 10E-09; // täpsus

        Random rn = new Random();

        int oldSqrt = rn.nextInt(11) + 1;  // +1 juhuks kui genereerib 0
        int newSqrt = (number/oldSqrt + oldSqrt) / 2;

        while(Math.abs(oldSqrt - newSqrt) > EPSILON){
            oldSqrt = newSqrt;
            newSqrt = (number/oldSqrt + oldSqrt) / 2;
        }

        return newSqrt; // tagastab ruutjuure
    }

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("Sisesta arv: ");
        int number = reader.nextInt();

        System.out.println(sqrt(number));


        /*
        [kertlil@greeny 01_funktsioon]$ java NewtonMethod
        Sisesta arv: 16
        4.0
        */
    }
}