public class Main {
    public static void main(String[] args) {
        System.out.println("---------- Task 1 ----------");
        Person personObject1 = new Person();
        personObject1.name = "Zaid";
        personObject1.age = 7;
        personObject1.work();
        Person personObject2 = new Person();
        personObject2.name = "Ali";
        personObject2.age = 8;
        personObject2.work();

        System.out.println("---------- Task 2 ----------");
        Rectangle rectangleObject = new Rectangle();
        rectangleObject.width = 50;
        rectangleObject.height = 40;
        System.out.println("The Area of rectangle is: " + rectangleObject.calcArea());
        System.out.println("The Perimeter of rectangle is: " + rectangleObject.calcPerimeter());

        System.out.println("---------- Task 3 ----------");
        TravelSystem travelSystemObject = new TravelSystem();
        travelSystemObject.SearchFlights();
        travelSystemObject.SearchHotel();
        travelSystemObject.BookReservation();
        travelSystemObject.CancelReservation();

        System.out.println("---------- Task 4 ----------");
        Airplane airplaneObject = new Airplane();
        airplaneObject.flight_num = 1002;
        airplaneObject.destination = "Karachi";
        airplaneObject.departure = "22:00 AM";
        airplaneObject.checkStatus();
        airplaneObject.checkDelay();
    }
}

