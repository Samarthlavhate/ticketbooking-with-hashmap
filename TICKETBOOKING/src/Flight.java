import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class Flight  {
    private String flight_no;
    private String source;
    private String  destination;
    private String time;
    private int fare;

    public Flight(String flight_no, String source, String destination, String time, int fare) {
        this.flight_no = flight_no;
        this.source = source;
        this.destination = destination;
        this.time = time;
        this.fare = fare;
    }

    public String getFlight_no() {
        return flight_no;
    }

    public void setFlight_no(String flight_no) {
        this.flight_no = flight_no;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flight_no='" + flight_no + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", time='" + time + '\'' +
                ", fare=" + fare +
                '}';
    }


}
