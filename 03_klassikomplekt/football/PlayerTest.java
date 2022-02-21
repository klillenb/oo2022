public class PlayerTest{
    public static void main(String[] arg){
        Player p1 = new Player("Tamm", 7, 12, 30, 3.5);
        Player p2 = new Player("Kask", 5, 10, 60, 4);

        Team t1 = new Team("Puud");
        t1.addPlayer(p1);
        t1.addPlayer(p2);

        System.out.println(t1);

        p1.move(2);
        p2.move(3);
        System.out.println(t1);
        t1.move(1);
        t1.closest(10, 10);
        System.out.println(t1);
    }
}