
import java.util.Scanner;
public class IfStatementDemo{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        if(temperature == 90){
            System.out.println("Person has fever");
        }
        System.out.println("Execution completed");
    }
}