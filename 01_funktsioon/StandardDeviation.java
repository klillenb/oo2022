public class StandardDeviation{
    //leian keskmise
    public static double average(String[] sd){
        double sum = 0;
        for(int i = 0; i < sd.length; i++){
            sum += Double.valueOf(sd[i]);
        }
        System.out.println(sum);
        return sum / sd.length;
    }

    //leian hälbe
    public static double[] deviation(String[] sd){
        double[] v = new double[sd.length];
        for(int i = 0; i < sd.length; i++){
            v[i] = 
        }
    }

    public static void main(String[] args){
        System.out.println(average(args));
    }


}

//ruutjuur - System.out.println(Math.sqrt());