package creational.prototype;

public abstract class GameUnit implements Cloneable {

    Position position;

    public GameUnit() {
        this.position = new Position(0, 0);
    }

    public GameUnit(int x, int y) {
        this.position = new Position(x, y);
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        GameUnit g1 = (GameUnit) super.clone();
        g1.initialize();
        return g1;
    }

    private void initialize() {
        this.position = new Position(0, 0);
        reset();
    }

    public abstract void reset();
}
