//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same (Singleton works!).");
        } else {
            System.out.println("Logger instances are different (Singleton failed!).");
        }
    }
}