public class Kast {
    String kastityyp;
    Double kastihind;
    Double kastimass;
    Integer pesadeArv;

    public Kast(String kastityyp, Double kastihind, Double kastimass, Integer pesadeArv) {
        this.kastityyp = kastityyp;
        this.kastihind = kastihind;
        this.kastimass = kastimass;
        this.pesadeArv = pesadeArv;
    }

    public Double koguMass(Joogipudel pudel){
        return pesadeArv * pudel.pudeliMass() + kastimass;
    }

    private static double round (double value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
    }

    public Double koguHind(Joogipudel pudel){
        Double hind = pesadeArv * pudel.hind() + kastihind;
        return round(hind, 2);
    }

    public Double villimine(Joogivaat vaat, Joogipudel pudel){
        return pesadeArv * (vaat.villimine(pudel));
    }
}
