import java.io.*;

public class Read1{
    public static void main(String[] arg) throws IOException{
        BufferedReader br1 = new BufferedReader(
            new FileReader("persons.txt"));
        String line1 = br1.readLine();
        String[] m = line1.split(" ");
        String name = m[0];
        String heightStr = m[1];
        int cm = Integer.parseInt(heightStr);
        double meters = cm / 100.0;

        System.out.println(name + ", pikkusega " + meters + " meetrit");
    }
}