package creational.abstractfactory.instance;

import creational.abstractfactory.storage.Storage;

public class GoogleComputeEngineInstance implements Instance {

    private Capacity capacity;

    public GoogleComputeEngineInstance(Capacity capacity) {
        this.capacity = capacity;
        System.out.println("Created GoogleComputeEngineInstance");
    }

    @Override
    public void start() {
        System.out.println("GoogleComputeEngineInstance started...");
    }

    @Override
    public void stop() {
        System.out.println("GoogleComputeEngineInstance stopped...");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println(storage + " attached in GoogleComputeEngineInstance");
    }

    @Override
    public String toString() {
        return "GoogleComputeEngineInstance{" +
                "capacity=" + capacity +
                '}';
    }
}
