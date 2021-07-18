
import java.util.Scanner;
public class ForLoopDemo{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start from number:");
        int x = scanner.nextInt();//initialization
        System.out.println("End till number:");
        int y = scanner.nextInt();//end

        for(int i = x; i<= y; i++ ){
            if(i == 10){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Loop execution completed");
    }
}