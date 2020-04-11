package creational.abstractfactory.storage;

public class S3Storage implements Storage {

    private int capacityInMib;

    public S3Storage(int capacityInMib) {
        this.capacityInMib = capacityInMib;
        System.out.println("Allocated " + capacityInMib + " on S3 Storage");
    }

    @Override
    public String getId() {
        return "s3pcs1";
    }

    @Override
    public int getCapacity() {
        return capacityInMib;
    }

    @Override
    public String toString() {
        return "S3Storage{" +
                "capacityInMib=" + capacityInMib +
                '}';
    }
}
