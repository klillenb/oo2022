public class Test3{
    public static void main(String[] arg){
        Logger fileLogger = new FileLogger("logid.txt");
        CountLogger countingLogger = new CountLogger(fileLogger);
        Logger testLogger = countingLogger;
        testLogger.log("algus");
        if(arg.length == 2){
            System.out.println(Integer.parseInt(arg[0]) * Integer.parseInt(arg[1]));
        }
        testLogger.log("ots");
        System.out.println(countingLogger.countNum());
    }
}