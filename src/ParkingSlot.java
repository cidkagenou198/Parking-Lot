public class ParkingSlot {
    private int id;
    private SlotType type;
    private boolean occupied;
    private int distanceFromGate;

    public ParkingSlot(int id, SlotType type, int distance) {
        this.id = id;
        this.type = type;
        this.distanceFromGate = distance;
        this.occupied = false;
    }

    public boolean isAvailable() {
        return !occupied;
    }

    public void occupy() {
        occupied = true;
    }

    public void free() {
        occupied = false;
    }

    public SlotType getType() {
        return type;
    }

    public int getDistance() {
        return distanceFromGate;
    }
}