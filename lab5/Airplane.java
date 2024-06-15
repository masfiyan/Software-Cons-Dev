public class Airplane {
    int flight_num;
    String destination;
    String departure;

    public void checkStatus() {
        System.out.println("The flight number " + flight_num + " will be reaching " + destination + " at " + departure);

    }
    public void checkDelay() {
        System.out.println("The flight number " + flight_num + " will be delayed.");

    }
}
