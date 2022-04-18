public class SamaTyypiPaar<T extends Comparable<T>>
        implements Comparable<SamaTyypiPaar<T>>{
    public T esimene;
    public T teine;

    @Override
    public int compareTo(SamaTyypiPaar<T> vorreldav){
        int vahe1 = esimene.compareTo(vorreldav.esimene);
        if(vahe1 != 0){
            return vahe1;
        }
        return teine.compareTo(vorreldav.teine);
    }

    @Override
    public String toString() {
        return "("+esimene+"; "+teine+")";
    }
}