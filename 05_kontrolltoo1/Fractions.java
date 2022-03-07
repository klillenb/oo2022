public class Fractions{
    //viib murru segaarvu kujule
   static void mixedNumber(int num, int den){
       if(num % den == 0){
           System.out.println(num + "/" + den + " = " + num/den);
       } else {
            int newNum = num % den;
            int mixedNumber = num / den;
            System.out.println(num + "/" + den + " = " + mixedNumber + " " + newNum + "/" + den);
        }
    }

    //leiab suurima ühisteguri
    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b % a, a);
    }

    //taandamine
    static void lowest(int num3, int den3){
        int common = gcd(num3, den3);
        den3 = den3 / common;
        num3 = num3 / common;
        System.out.println(num3 + "/" + den3);
        if(num3 > den3){
            mixedNumber(num3, den3);
        }
    }

    //murdude liitmine
    static void addFraction(int num1, int den1, int num2, int den2){
        int den3 = gcd(den1, den2);
        //leian väiksema ühise muutuja
        den3 = (den1 * den2) / den3;
        int num3 = num1 * (den3 / den1) + num2 * (den3 / den2);
        lowest(num3, den3);
    }

    public static void main(String[] arg){
        int num1 = 5, den1 = 6;
        int num2 = 7, den2 = 8;

        //mixedNumber(num1, den1);
        //mixedNumber(num2, den2);
        System.out.print(num1 + "/" + den1 + " + " + num2 + "/" + den2 +" = ");
        addFraction(num1, den1, num2, den2);
    }
}