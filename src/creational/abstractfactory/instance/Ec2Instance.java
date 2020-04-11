package creational.abstractfactory.instance;

import creational.abstractfactory.storage.Storage;

public class Ec2Instance implements Instance {

    private Capacity capacity;

    public Ec2Instance(Capacity capacity) {
        this.capacity = capacity;
        System.out.println("Created Ec2Instance");
    }

    @Override
    public void start() {
        System.out.println("Ec2Instance started...");
    }

    @Override
    public void stop() {
        System.out.println("Ec2Instance stopped...");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println(storage + " attached in Ec2Instance");
    }

    @Override
    public String toString() {
        return "Ec2Instance{" +
                "capacity=" + capacity +
                '}';
    }
}
