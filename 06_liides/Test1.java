public class Test1{
    public static void main(String[] arg){
        //Logger testLogger = new SimpleLogger();
        Logger testLogger = new FileLogger("logid.txt");
        testLogger.log("algus");
        if(arg.length == 2){
            System.out.println(Integer.parseInt(arg[0]) * Integer.parseInt(arg[1]));
        }
        testLogger.log("ots");
    }
}