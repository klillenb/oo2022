public class Punktid3{
    public static void main(String[] args){
        double[][] arr = {
                {1.0, 2.5},
                {3.0, 4.0},
                {1.5, 3.5},
                {2.5, 4.5, 3.0},
        };
        Punkt2D pd[] = new Punkt2D[arr.length];
        double suurim = 0.0;
        for(int i = 0; i < arr.length; i++){
            pd[i] = new Punkt2D(arr[i][0], arr[i][1]);
            if(pd[i] instanceof Punkt3D){
                Punkt3D p = (Punkt3D)pd[i];
                System.out.println(p.kaugusNullist3D());
            }
            System.out.println(pd[i].kirjutaAndmed());
            if(pd[i].kaugusNullist2D() > suurim){
                suurim = pd[i].kaugusNullist2D();
            }
        }
        System.out.println("Suurim kaugus nullist on: " + suurim);


    }
}