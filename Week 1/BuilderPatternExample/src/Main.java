//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Computer basicComputer = new Computer.Builder("Intel i3", "4GB")
                .build();
        System.out.println("Basic Computer Configuration:");
        basicComputer.showConfig();
    }
}