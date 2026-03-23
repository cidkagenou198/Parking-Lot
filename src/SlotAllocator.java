import java.util.*;

public class SlotAllocator {

    public ParkingSlot assignSlot(List<ParkingSlot> slots, Vehicle vehicle) {

        List<ParkingSlot> valid = new ArrayList<>();

        for (ParkingSlot slot : slots) {
            if (!slot.isAvailable())
                continue;

            if (isCompatible(vehicle.getType(), slot.getType())) {
                valid.add(slot);
            }
        }

        valid.sort(Comparator.comparingInt(ParkingSlot::getDistance));

        if (valid.isEmpty())
            return null;

        ParkingSlot selected = valid.get(0);
        selected.occupy();
        return selected;
    }

    private boolean isCompatible(VehicleType v, SlotType s) {
        switch (v) {
            case BIKE:
                return true;
            case CAR:
                return s == SlotType.MEDIUM || s == SlotType.LARGE;
            case BUS:
                return s == SlotType.LARGE;
        }
        return false;
    }
}