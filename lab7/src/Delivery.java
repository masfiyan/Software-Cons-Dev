import java.util.UUID;
import java.util.Scanner;

public class Delivery {
    int deliveryID;
    String receiverName;
    String receiverAddress;

    public Delivery(int deliveryID, String receiverName, String receiverAddress) {
        this.deliveryID = deliveryID;
        this.receiverName = receiverName;
        this.receiverAddress = receiverAddress;
    }

    public void generate(String transactionName) {
        UUID delivery_uuid = UUID.randomUUID();
        this.deliveryID = Math.abs(delivery_uuid.hashCode());
        System.out.println("Delivery ID " + this.deliveryID + " generated against transaction: " + transactionName);
    }


    public void update(String newName) {
        System.out.println("Enter new receiver name: ");
        Scanner newReceiverName = new Scanner(System.in);
        this.receiverName = newReceiverName.nextLine();
        System.out.println("Enter new delivery address");
        Scanner newAddress = new Scanner(System.in);
        this.receiverAddress = newAddress.nextLine();
        System.out.println("Customer details updated successfully.");
    }

}
