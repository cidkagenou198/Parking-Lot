import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Map;

public class BillingService {

    private Map<SlotType, Integer> rates = Map.of(
            SlotType.SMALL, 10,
            SlotType.MEDIUM, 20,
            SlotType.LARGE, 50);

    public int calculate(Ticket ticket, LocalDateTime exitTime) {
        long hours = Duration.between(ticket.getEntryTime(), exitTime).toHours();
        if (hours == 0)
            hours = 1;

        return (int) hours * rates.get(ticket.getSlot().getType());
    }
}