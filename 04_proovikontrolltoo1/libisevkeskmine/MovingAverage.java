import java.util.*;

public class MovingAverage{
    public static void main(String[] arg){
        Average average = new Average();
        Scanner reader = new Scanner(System.in);
        int[] nums = new int[6];

        System.out.println("Leiame arvude keskmise: ");
        for(int i = 0; i < nums.length; i++){
            System.out.print("Sisesta arv: ");
            nums[i] = reader.nextInt();
        }
        average.averageOfThree(nums);
        average.findMovingAverage(nums);
        System.out.println(average);

        Average3 a = new Average3();
        a.add(2);
        a.add(6);
        a.add(4);
        a.add(5);
        a.add(3);
        System.out.println(a.movingAverage());
    }
}