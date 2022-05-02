public class Joogivaat {
    Double ruumala;
    Double joogiKogusLiitrites;
    Jook jook;

    public Joogivaat(Double ruumala, Double joogiKogusLiitrites, Jook jook) {
        this.ruumala = ruumala;
        this.joogiKogusLiitrites = joogiKogusLiitrites;
        this.jook = jook;
    }

    public Double taidaPudel(Joogipudel pudel){
        if(joogiKogusLiitrites > 0) {
            if(joogiKogusLiitrites > pudel.maht){
                this.joogiKogusLiitrites = joogiKogusLiitrites - pudel.maht;
            } else {
                pudel.maht = joogiKogusLiitrites;
            }
        }
        return pudel.maht;
    }

    public Double villimine(Joogipudel pudel){
        return joogiKogusLiitrites / pudel.maht;
    }
}
