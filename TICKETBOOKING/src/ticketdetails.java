import java.util.ArrayList;

public class ticketdetails {
   Passenger passenger;
    Flight flight;

    public ticketdetails(Passenger passenger, Flight flight) {
        this.passenger = passenger;
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "ticketdetails{" +
                "passenger=" + passenger +
                ", flight=" + flight +
                '}';
    }
}
