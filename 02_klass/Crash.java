import java.util.Scanner;

public class Crash{
    public static void main(String[] arg){
        int[][] table = new int[10][10];

        Scanner reader = new Scanner(System.in);

        System.out.print("Sisesta esimese teekond: ");
        String t1Instruction = reader.nextLine();

        System.out.print("Sisesta teise teekond: ");
        String t2Instruction = reader.nextLine();

        Turtle t1 = new Turtle();
        Turtle t2 = new Turtle();

        for(int j = 0; j < 2; j++){
            for(int i = 0; i < 9; i++){t2.forward();}
            t2.turn();
        }



        for(int i = 0; i < t1Instruction.length(); i++){
            if(t1Instruction.charAt(i) == 'f'){
                t1.forward(); 
                table[t1.askY()][t1.askX()] = 1;
            } 
            if(t1Instruction.charAt(i) == 't'){
                t1.turn(); 
                table[t1.askY()][t1.askX()] = 1;
            }
            System.out.println(t1);
        } 

        for(int j = 0; j < t2Instruction.length(); j++){
            if(t2Instruction.charAt(j) == 'f'){
                t2.forward();
                table[t2.askX()][t2.askY()] = 2;
            }
            if(t2Instruction.charAt(j) == 't'){
                t2.turn();
                table[t2.askX()][t2.askY()] = 2;
            }
            System.out.println(t2);
        }

        for(int k = 0; k < 10; k++){
            for(int l = 0; l < 10; l++){
                System.out.print(table[k][l]);
            }
            System.out.println();
        }

        
    }
}