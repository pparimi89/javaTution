
import java.util.Scanner;
public class WhileLoopDemo{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start from number:");
        int x = scanner.nextInt();//initialization
        System.out.println("End till number:");
        int y = scanner.nextInt();//end

        while(x <=y){
            System.out.println(x);
            x++;
        }
        System.out.println("Loop execution completed");
    }

}