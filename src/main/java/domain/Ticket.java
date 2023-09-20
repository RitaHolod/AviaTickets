package domain;

public class Ticket implements Comparable<Ticket>{
    protected int id;
    protected int price;
    protected String departureIATA;
    protected String arrivalIATA;
    protected int travelTime;

    public Ticket(int id, int price, String departureIATA, String arrivalIATA, int travelTime ){
        this.id = id;
        this.price= price;
        this.departureIATA = departureIATA;
        this.arrivalIATA = arrivalIATA;
        this.travelTime = travelTime;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getDepartureIATA() {
        return departureIATA;
    }

    public String getArrivalIATA() {
        return arrivalIATA;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDepartureIATA(String departureIATA) {
        this.departureIATA = departureIATA;
    }

    public void setArrivalIATA(String arrivalIATA) {
        this.arrivalIATA = arrivalIATA;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    @Override
    public int compareTo(Ticket o) {
        return price - o.getPrice();
    }
}
