public class Test3{
    public static void main(String[] arg){
        int[][] table = new int[10][10];
        //table[2][3] = 1;
        String instruction = arg[0];

        Turtle t1 = new Turtle();

        for(int i = 0; i < instruction.length(); i++){
            if(instruction.charAt(i) == 'f'){
                t1.forward(); 
                table[t1.askY()][t1.askX()] = 1;
                } 
            if(instruction.charAt(i) == 't'){
                t1.turn(); 
                table[t1.askY()][t1.askX()] = 1;
                }
            System.out.println(t1);
        } 
        for(int k = 0; k < 10; k++){
            for(int l = 0; l < 10; l++){
                System.out.print(table[k][l]);
            }
            System.out.println();
        }

        
    }
}

// Koostage Test2a.java
// Andke teekond edasi tekstina, mis koosneb kolmest tähest "f" ja "t"
// Pärast iga tähte tekkinud seisund kuvatakse