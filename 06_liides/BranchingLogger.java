import java.util.*;
/*
    Saadab saabunud teated edasi siia külge registreerunud logijatele
*/

public class BranchingLogger implements Logger{
    List<Logger> buffer = new ArrayList<Logger>();

    public void addLogger(Logger lg){buffer.add(lg);}

    public void log(String teade){
        for(Logger help: buffer){
            help.log(teade);
        }
    }
}