public class CountLogger implements Logger{
    Logger sihtLogija;
    int count = 0;
    public CountLogger(Logger logger){
        sihtLogija = logger;
    }
    public void log(String teade){
        sihtLogija.log(teade);
        count++;
    }

    public int countNum(){return count;}
}