package creational.abstractfactory;

import creational.abstractfactory.factory.AwsResourceFactory;
import creational.abstractfactory.factory.GoogleCloudResourceFactory;
import creational.abstractfactory.factory.ResourceFactory;
import creational.abstractfactory.instance.Instance;
import creational.abstractfactory.storage.Storage;

public class Client {

    private ResourceFactory factory;

    public Client(ResourceFactory factory) {
        this.factory = factory;
    }

    public Instance createServer(Instance.Capacity capacity, int storageMib) {
        Instance instance = factory.createInstance(capacity);
        Storage storage = factory.createStorage(storageMib);
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args) {
        Client aws = new Client(new AwsResourceFactory());
        Instance i1 = aws.createServer(Instance.Capacity.small, 20480);
        i1.start();
        i1.stop();

        System.out.println("\n**********************************************\n");

        Client gcp = new Client(new GoogleCloudResourceFactory());
        Instance i2 = gcp.createServer(Instance.Capacity.large, 15340);
        i2.start();
        i2.stop();
    }

}
