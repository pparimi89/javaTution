
import java.util.Scanner;
public class SwitchStatementDemo{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();

        switch (temperature){
            case 98:
                System.out.println("Person has light fever");
                break;
            case 99:
                System.out.println("Person has light fever");
                break;
            case 100:
                System.out.println("Person has light fever");
                break;
            case 101:
                System.out.println("Person has light fever");
                break;
            default:
                System.out.println("Person has no fever/High fever");
        }

        System.out.println("Execution completed");
    }
}