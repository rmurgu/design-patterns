package creational.objectpool;

import java.awt.*;

public class Client {

    public static final ObjectPool<Bitmap> bitmapPool = new ObjectPool<>(() -> new Bitmap("Logo.bmp"), 2);


    public static void main(String[] args) {
        Bitmap b1 = bitmapPool.get();
        b1.setLocation(new Point(10, 10));
        Bitmap b2 = bitmapPool.get();
        b2.setLocation(new Point(-10, 0));

        b1.draw();
        b2.draw();

        System.out.println(b1);
        System.out.println(b2);

        bitmapPool.release(b1);
        bitmapPool.release(b2);
    }
}
