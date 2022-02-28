import java.util.*;

public class Average3{
    List<Double> container = new ArrayList<Double>(); 
    List<Double> answers = new ArrayList<Double>();

    public void add(double num){
        container.add(num);
        int n = container.size();
        if(n >= 3){
            answers.add((container.get(n - 3) + container.get(n - 2) + container.get(n - 1)) / 3.0);
        }
    }

    public List<Double> movingAverage(){
        return answers;
    }
}