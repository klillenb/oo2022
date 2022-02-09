import java.util.Scanner;

public class Triangle{

    public static double hypotenuse(int firstSide, int secondSide){
        double c = Math.sqrt(Math.pow(firstSide, 2) + Math.pow(secondSide, 2));
        double result = 0;

        if((Math.pow(firstSide, 2) + Math.pow(secondSide, 2)) == Math.pow(c, 2)){
            result = c;
        }

        return result;
    }

    public static double[] findAngles(int firstSide, int secondSide, double thirdSide){
        double[] angles = new double[2];

        angles[0] = firstSide / thirdSide;
        angles[1] = secondSide / thirdSide;

        return angles;
    }

    public static void main(String[] args){

        //Scanner klass loeb klaviatuuri sisestust
        Scanner reader = new Scanner(System.in);
        System.out.print("Sisesta täisnurkse kolmnurga kaatetid: ");
        
        //loeb kaatetite väärtused muutujasse
        int firstSide = reader.nextInt();
        int secondSide = reader.nextInt();

        double thirdSide = hypotenuse(firstSide, secondSide);

        double[] angles = findAngles(firstSide, secondSide, thirdSide);

        if(angles[0] + angles[1] + 90 == 180){
            System.out.println("Kolmnurga nurgad on: " + angles[0] + angles[1] + 90 + " kraadi");
        } else {
            System.out.println("Midagi läks valesti");
        }

        System.out.println("Kolmnurga hüpotenuusi pikkus on " + thirdSide);
    }
}