
import java.util.Scanner;

public class task1 {
    int SDC;
    int AI;

    public task1() {
        Scanner scanner = new Scanner(System.in); //Getting the input from the user.
        System.out.println("Enter SDC marks: ");
        this.SDC = scanner.nextInt();

        System.out.println("Enter AI marks: ");
        this.AI = scanner.nextInt();

    }

    public int getSDC() {
        return SDC;
    }

    public int getAI() {
        return AI;
    }
}
