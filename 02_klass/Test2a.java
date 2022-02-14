public class Test2a{
    public static void main(String[] arg){
        String instruction = arg[0];

        Turtle t1 = new Turtle();

        for(int i = 0; i < instruction.length(); i++){
            if(instruction.charAt(i) == 'f'){t1.forward();}
            if(instruction.charAt(i) == 't'){t1.turn();}
            System.out.println(t1);
        }
    }
}

// Koostage Test2a.java
// Andke teekond edasi tekstina, mis koosneb kolmest tähest "f" ja "t"
// Pärast iga tähte tekkinud seisund kuvatakse