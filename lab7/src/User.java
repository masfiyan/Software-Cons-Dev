import java.util.Scanner;

public class User {
    private int userID;
    String name;
    String userAddress;
    String userDescription;
    private String userName;
    private String userPassword;

    public User() {
        this.name = null;
        this.userAddress = null;
        this.userDescription = null;
        this.userName = null;
        this.userPassword = null;

    }

    public void createUser() {
        Scanner inputUserDetails = new Scanner(System.in);
        System.out.println("Creating a new user...");
        System.out.println("Enter new user name: ");
        this.name = inputUserDetails.nextLine();
        System.out.println("Enter new user address: ");
        this.userAddress = inputUserDetails.nextLine();
        System.out.println("Enter new user description: ");
        this.userDescription = inputUserDetails.nextLine();
//        inputUserDetails.close();
    }

    public void createTransaction(String transactionName) {
        System.out.println("Transaction: " + transactionName + " has been created for user named: " + this.userName);
    }

    public void updateUser() {
        Scanner inputUserDetails = new Scanner(System.in);
        System.out.println("Updating an existing user...");
        System.out.println("Enter new user name: ");
        this.name = inputUserDetails.nextLine();
        System.out.println("Enter new user address: ");
        this.userAddress = inputUserDetails.nextLine();
        System.out.println("Enter new user description: ");
        this.userDescription = inputUserDetails.nextLine();
        inputUserDetails.close();
    }
}
