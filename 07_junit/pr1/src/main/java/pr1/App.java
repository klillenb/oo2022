/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package pr1;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static int multiplyTwo(int num){
        return num * 2;
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
