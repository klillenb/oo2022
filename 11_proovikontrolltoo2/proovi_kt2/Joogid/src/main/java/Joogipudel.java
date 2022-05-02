public class Joogipudel {
    Double maht;
    String pudelityyp;
    Double mass;
    Double taara = 0.1;
    Jook jook;

    public Joogipudel(Double maht, String pudelityyp, Double mass, Jook jook) {
        this.maht = maht;
        this.pudelityyp = pudelityyp;
        this.mass = mass;
        this.jook = jook;
    }

    public Double pudeliMass(){
        if(jook == null){
            return mass;
        } else {
            return mass + (maht * jook.erikaal);
        }
    }

    public Double hind(){
        return maht * jook.liitriOmahind + taara;
    }
}
