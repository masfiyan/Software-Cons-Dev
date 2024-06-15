public class Transaction {
    int transactionID;
    String transactionName;
    String transactionDesc;
    String transactionDate;

    public Transaction(int transactionID, String transactionName, String transactionDesc, String transactionDate) {
        this.transactionID = transactionID;
        this.transactionName = transactionName;
        this.transactionDesc = transactionDesc;
        this.transactionDate = transactionDate;
    }

    public void create() {
        System.out.println("The transaction has been created successfully.");
    }

    public void update() {
        System.out.println("The transaction has been updated successfully.");
    }
}
