import java.util.Scanner;

public class Test1{
    public static void main(String[] arg){
        Scanner reader = new Scanner(System.in);
        System.out.print("Sisesta isikukood, saad soo vastu: ");
        IDcode test = new IDcode(reader.nextLine());
        System.out.println(test.birthYear());
        System.out.println(test.gender());
    }
}