package day04;

public class Passenger {
    private String name;
    private String ticketId;
    private int packageCount;

    public Passenger(String name, String ticketId, int packageCount) {
        this.name = name;
        this.ticketId = ticketId;
        this.packageCount = packageCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public int getPackageCount() {
        return packageCount;
    }

    public void setPackageCount(int packageCount) {
        this.packageCount = packageCount;
    }
}
