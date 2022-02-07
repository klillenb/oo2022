public class StandardDeviation{

    public static double[] toNumbers(String[] sd){ //double[] on massiiv
        double[] nums = new double[sd.length];
        for(int i = 0; i < sd.length; i++){
            nums[i] = Double.parseDouble(sd[i]);
        }
        return nums;
    }

    //leian keskmise ja hälbe
    public static double[] deviation(double[] sd){
        double sum = 0;
        double mean = 0;
        for(int i = 0; i < sd.length; i++){
            sum += Double.valueOf(sd[i]);
        }
        mean = sum / sd.length;
        double[] v = new double[sd.length];
        for(int i = 0; i < sd.length; i++){
            v[i] = Math.pow((Double.valueOf(sd[i]) - mean), 2);
        }
        return v;
    }

    public static double stdev(double[] nums){
        double sum = 0;
        double average = 0;
        for(int i = 0; i < nums.length; i++){
            sum += Double.valueOf(nums[i]);
        }
        average = sum / nums.length;
        double stdev = Math.sqrt(average);
        return stdev;
    }

    public static void main(String[] args){
        double[] numbers = toNumbers(args);
        double[] nums = deviation(numbers);
        System.out.println(stdev(nums));
    }


}

//ruutjuur - System.out.println(Math.sqrt());