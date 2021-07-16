
import java.util.Scanner;
public class IfElseLadderStatementDemo{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        if(temperature == 98){
            System.out.println("Person has light fever");
        }else if(temperature == 99) {
            System.out.println("Person has moderate fever");
        }else if(temperature == 100) {
            System.out.println("Person has high fever");
        }else if(temperature >= 101) {
            System.out.println("Person has very high fever");
        }else{
            System.out.println("Person dont have fever, and he is normal");
        }
        System.out.println("Execution completed");
    }
}