public class Test2{
    public static void main(String[] arg){
        Logger firstLogger = new SimpleLogger();
        Logger secondLogger = new FileLogger("logid.txt");

        //Lisage kolmas logija, mis saadab teated alamkataloogis olevasse faili
        //Kontrolli toimimist
        Logger thirdLogger = new FileLogger("Logs/logid2.txt");
        thirdLogger.log("algus");

        BranchingLogger connector = new BranchingLogger();

        connector.addLogger(firstLogger);
        connector.addLogger(secondLogger);
        connector.addLogger(thirdLogger);

        Logger testLogger = connector;

        testLogger.log("algus");
        if(arg.length == 2){
            System.out.println(Integer.parseInt(arg[0]) * Integer.parseInt(arg[1]));
        }
        testLogger.log("ots");
    }
}