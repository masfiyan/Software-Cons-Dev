import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);

        int temp = num1;
        num1 = sum;
        sum = temp;

        System.out.println("After swapping, first number is: "
                + num1 + ", second number: " + num2 +
                " and the sum becomes: " + sum);
        scanner.close();
    }
}