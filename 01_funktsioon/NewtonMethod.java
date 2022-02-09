import java.util.Scanner;
import java.util.Random;

public class NewtonMethod{
    public static double sqrt(int number){
        double EPSILON = 10E-09;

        Random rn = new Random();

        int oldSqrt = rn.nextInt(11);
        int newSqrt = (number/oldSqrt + oldSqrt) / 2;

        while(Math.abs(oldSqrt - newSqrt) > EPSILON){
            oldSqrt = newSqrt;
            newSqrt = (number/oldSqrt + oldSqrt) / 2;
        }

        return newSqrt;
    }

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("Sisesta arv: ");
        int number = reader.nextInt();

        System.out.println(sqrt(number));
    }
}