package creational.prototype;

public class General extends GameUnit {

    private String status = "sleeping";

    public String getStatus() {
        return status;
    }

    public void boostMorale() {
        status = "boosting morale";
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Generals are unique");
    }

    @Override
    public void reset() {
        throw new UnsupportedOperationException("Reset not supported");
    }

    @Override
    public String toString() {
        return "General{" +
                "status='" + status + '\'' +
                ", position=" + position +
                '}';
    }
}
