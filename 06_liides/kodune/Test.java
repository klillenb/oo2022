import java.util.*;

public class Test{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vali millise looma kohta infot tahad:\n1. lehm\n2. koer\n3. kass");
        Integer userInput = sc.nextInt();
        switch(userInput){
            case 1:
                Cow cow = new Cow();
                System.out.println("Lehm on " + cow.size);
                System.out.println("Tema on " + cow.diet);
                System.out.println(cow.animalSound());
                break;
            case 2:
                Dog dog = new Dog();
                System.out.println("Koer on " + dog.size);
                System.out.println("Tema on " + dog.diet);
                System.out.println(dog.animalSound());
                break;
            case 3:
                Cat cat = new Cat();
                System.out.println("Kass on " + cat.size);
                System.out.println("Tema on " + cat.diet);
                System.out.println(cat.animalSound());
                break;
            default:
                System.out.println("Sisestatud valik ei sobi");
        }
    }
}