
import java.util.Scanner;
public class IfElseStatementDemo{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        if(temperature >= 98){
            System.out.println("Person has fever");
        }else {
            System.out.println("Person dont have fever, and he is normal");
        }
        System.out.println("Execution completed");
    }
}