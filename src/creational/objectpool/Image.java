package creational.objectpool;


import java.awt.*;

public interface Image extends Poolable {

    void draw();

    Point getLocation();

    void setLocation(Point location);
}
