public class Waiter{
    String name;
    int waitTime;

    public Waiter(String newName){
        name = newName;
    }
    
    public int orderToKitchen(String order){
        switch(order){
            case "kala": case "1":
                waitTime = 7;
            break;
            case "kana": case "2":
                waitTime = 15;
            break;
            case "veis": case "3":
                waitTime = 18;
            break;
            case "part": case "4":
                waitTime = 13;
            break;
            default:
                System.out.println("Sellist toodet pole menüüs");
        }
        return waitTime;
    }

    public String toString(){
        return name + " võttis vastu tellimuse, ooteaeg " + waitTime + " minutit";
    }
}