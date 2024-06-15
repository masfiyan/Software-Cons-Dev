import java.util.Scanner;

public class Payment {
    int paymentID;
    String senderName;
    String senderDescription;

    int amount;

    public Payment(int paymentID, String senderName, String senderDescription) {
        this.paymentID = paymentID;
        this.senderName = senderName;
        this.senderDescription = senderDescription;
        this.amount = 0;
    }

    public void calculate(String transactionName) {
        Scanner amount = new Scanner(System.in);
        System.out.println("Enter amount to calculate");
        this.amount = amount.nextInt();
        System.out.println("Calculated amount is: " + this.amount + " against the transaction:" + transactionName);
        amount.close();
    }
}

