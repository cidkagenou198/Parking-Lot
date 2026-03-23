import java.time.LocalDateTime;

public class Ticket {
    private Vehicle vehicle;
    private ParkingSlot slot;
    private LocalDateTime entryTime;

    public Ticket(Vehicle vehicle, ParkingSlot slot, LocalDateTime entryTime) {
        this.vehicle = vehicle;
        this.slot = slot;
        this.entryTime = entryTime;
    }

    public ParkingSlot getSlot() {
        return slot;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }
}