package creational.abstractfactory.storage;

public class GoogleCloudStorage implements Storage {

    private int capacityInMib;

    public GoogleCloudStorage(int capacityInMib) {
        this.capacityInMib = capacityInMib;
        System.out.println("Allocated " + capacityInMib + " on Google Cloud Storage");
    }

    @Override
    public String getId() {
        return "gcpcs1";
    }

    @Override
    public int getCapacity() {
        return capacityInMib;
    }

    @Override
    public String toString() {
        return "GoogleCloudStorage{" +
                "capacityInMib=" + capacityInMib +
                '}';
    }
}
