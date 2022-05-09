public class Alleel {
    public String nimetus;
    public boolean dominantne;

    public Alleel(String nimetus, boolean olemasolu) {
        this.nimetus = nimetus;
        this.dominantne = olemasolu;
    }

    @Override
    public String toString() {
        return "Alleel{" + "\n" +
                "nimetus='" + nimetus + '\'' +
                ", dominantsus=" + dominantne +
                '}';
    }
}
