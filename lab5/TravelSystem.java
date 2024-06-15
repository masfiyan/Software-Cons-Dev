import java.util.Scanner;
public class TravelSystem {
    public void SearchFlights() {
        System.out.println("Following are the flights, choose anyone:\n1)PIA 2)Emirates");
        Scanner scanner = new Scanner(System.in);

        String flight_chosen = scanner.nextLine();
        System.out.println("The chosen flight is: "+flight_chosen);

    }

    public void SearchHotel(){
        System.out.println("Following are the hotels, choose anyone:\n1)5-Star 2)4-Star");
        Scanner scanner = new Scanner(System.in);

        String hotel_chosen = scanner.nextLine();
        System.out.println("The chosen hotel is: " + hotel_chosen);

    }
    public void BookReservation(){
        System.out.println("The reservation is booked.");
    }
    public void CancelReservation(){
        System.out.println("The reservation is cancelled.");
    }

}
