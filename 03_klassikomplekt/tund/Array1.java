public class Array1{
    public static void main(String[] arg){
        String[] names = new String[3];
        names[0] = "Juku";
        names[1] = "Kati";
        names[2] = "Mati";
        System.out.println(names[1]);
        System.out.println(names.length);
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
    }
}