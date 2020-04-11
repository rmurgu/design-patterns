package creational.prototype;

public class Swordsman extends GameUnit {

    private String status = "idle";

    public String getStatus() {
        return status;
    }

    public void attack() {
        status = "attacking";
    }

    @Override
    public void reset() {
        status = "idle";
    }

    @Override
    public String toString() {
        return "Swordsman{" +
                "status='" + status + '\'' +
                ", position=" + position +
                '}';
    }
}
