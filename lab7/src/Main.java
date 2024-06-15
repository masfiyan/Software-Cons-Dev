import java.util.Date;
import java.time.LocalTime;

class Ecommerce {
    public static void main(String[] args) {
        System.out.println("Welcome to ecommerce store by zaid: ");
        // Handling User operations
        User user1 = new User();
        user1.createUser();

        // Handling Admin operations
        Admin admin = new Admin(001, "AdminOfEcommerceStore");
        admin.update();

        // Handling Seller operations
        Seller seller = new Seller(1001, "Ali");

        // Handling Customer operations
        Customer customer1 = new Customer(2001, "Asad");

        // Creating payment
        Payment payment1 = new Payment(4001, "Asad", "This is payment by a customer.");

        // Creating Delivery
        Delivery delivery1 = new Delivery(9001, "Asad", "North Nazimabad");


        // Creating & Updating Transaction for User,Delivery, Payment
        Transaction transaction1 = new Transaction(5001, "Transaction by user1", "Transcation for user1", "5/10/24");
        transaction1.create();
        transaction1.update();

        // Aggregating Transaction with User
        user1.createTransaction(transaction1.transactionName);

        // Composing payment with Transaction
        payment1.calculate(transaction1.transactionName);

        // Composing delivery with Transaction
        delivery1.generate(transaction1.transactionName);


    }
}


class BookingSystem {
    public static void main(String[] args) {
        // Creating instances of CustomerClass and Agent
        CustomerClass customer = new CustomerClass();
        Agent agent = new Agent();

        // Calling methods of CustomerClass
        customer.searchTicket();
        customer.bookTicket();
        customer.cancelTicket();
        customer.makePayment();
        customer.fillDetails();
        customer.addDetails();
        customer.modifyDetails();

        // Calling methods of Agent
        agent.searchTicket();
        agent.bookTicket();
        agent.cancelTicket();
        agent.makePayment();
        agent.fillDetails();

        // Creating instance of Ticket
        Date dateOfJourney = new Date();
        LocalTime time = LocalTime.now();
        Ticket ticket = new Ticket('A', 'B', dateOfJourney, time, "123", "1");

        // Creating instance of Refund
        Refund refund = new Refund(50.0f);

        // Calling method of Refund
        float refundedAmount = refund.refundAmount();
        System.out.println("Amount refunded: " + refundedAmount);
    }
}

class LabTask1 {
    public static void main(String[] args) {

        MarkSheet markSheet1 = new MarkSheet();
        System.out.println("Student name: " + markSheet1.student_name);
        System.out.println("Marks Obtained: " + markSheet1.obtainedMarks + "Total Marks: " + markSheet1.totalMarks);
        System.out.println("Percentage: " + markSheet1.calculatePercentage());
        System.out.println("Grade: " + markSheet1.calculateGrade());
        System.out.println("GPA: " + markSheet1.calculateGPA());
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------- LAB - TASKS -------------------------");
        LabTask1.main(args);

        System.out.println("------------------------- HOME - TASKS | Task - 1 -------------------------");
        Ecommerce.main(args);

        System.out.println("------------------------- HOME - TASKS | Task - 2 -------------------------");
        BookingSystem.main(args);


    }
}