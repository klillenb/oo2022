public class Funktsioon1{
    public static double sentimeetriteks(double tollid){
        return tollid * 2.54;
    }
    //tehke funktsioon sentimeetrid tollideks
    public static double tollideks(double sentimeetrid){
        return sentimeetrid / 2.54;
    }
    public static double[] reaalarvudeks(String[] sd){ //double[] on massiiv
        double[] v = new double[sd.length];
        for(int i = 0; i < sd.length; i++){
            v[i] = Double.parseDouble(sd[i]);
        }
        return v;
    }
    public static void main(String[] args){
        double[] arvud = reaalarvudeks(args);
        for(int i = 0; i < arvud.length; i++){
            System.out.println(sentimeetriteks(arvud[i]));
        }
    }
}
/* 
[kertlil@greeny 01_funktsioon]$ java Funktsioon1 2 8 16.3
5.08
20.32
41.402
*/
