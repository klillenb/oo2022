import java.util.*;

public class Customer{
    public String askWaiter(){
        System.out.print("Keda teenindajaks soovite? ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        return name;
    }

    public String order(){
        System.out.println("Menüüs on: ");
        System.out.println("1. kala \n2. kana \n3. veis \n4. part");
        System.out.print("Teie sooviks on: ");

        Scanner sc = new Scanner(System.in);
        String food = sc.nextLine();

        return food;
    }
}