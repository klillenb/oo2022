import java.io.*;

public class FileLogger implements Logger{
        String fileName;
        public FileLogger(String fileName){
            this.fileName = fileName;
        }
    public void log(String text){
        try{
            PrintWriter pw = new PrintWriter(new FileWriter(fileName, true));
            pw.println(new java.util.Date() + " " + text);
            pw.close();
        } catch(Exception e){
            System.out.println("Viga logimisel " + text);
        }
    }
}