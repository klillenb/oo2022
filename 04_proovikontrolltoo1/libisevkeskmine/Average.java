import java.util.Arrays;

public class Average{
    double result;
    double[] movingAverage;

    public double averageOfThree(int[] array){
        int numSum = 0;
        for(int i = 0; i < array.length; i++){
            numSum += array[i];
        }
        result = numSum / 3.0;
        return result;
    }

    public String toString(){
        return "Kolme arvu keskmine on: " + result + "\nUus massiiv: " + Arrays.toString(movingAverage);
    }

    public double[] findMovingAverage(int[] array){
        movingAverage = new double[array.length - 2];
        for(int i = 0; i < array.length - 2; i++){
            int[] newArray = Arrays.copyOfRange(array, i, i + 3);
            //System.out.println(newArray.length);
            movingAverage[i] = averageOfThree(newArray);
        }
        return movingAverage;
    }

}