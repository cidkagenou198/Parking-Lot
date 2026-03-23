import java.time.LocalDateTime;
import java.util.*;

public class ParkingLot {

    private List<ParkingSlot> slots;
    private SlotAllocator allocator;
    private BillingService billing;

    public ParkingLot(List<ParkingSlot> slots) {
        this.slots = slots;
        this.allocator = new SlotAllocator();
        this.billing = new BillingService();
    }

    public Ticket park(Vehicle vehicle, LocalDateTime time) {
        ParkingSlot slot = allocator.assignSlot(slots, vehicle);

        if (slot == null) {
            System.out.println("No slot available");
            return null;
        }

        return new Ticket(vehicle, slot, time);
    }

    public int exit(Ticket ticket, LocalDateTime exitTime) {
        ticket.getSlot().free();
        return billing.calculate(ticket, exitTime);
    }

    public void status() {
        Map<SlotType, Integer> count = new HashMap<>();

        for (ParkingSlot slot : slots) {
            if (slot.isAvailable()) {
                count.put(slot.getType(),
                        count.getOrDefault(slot.getType(), 0) + 1);
            }
        }

        System.out.println(count);
    }
}