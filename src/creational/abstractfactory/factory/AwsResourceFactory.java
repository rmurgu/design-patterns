package creational.abstractfactory.factory;

import creational.abstractfactory.instance.Ec2Instance;
import creational.abstractfactory.instance.Instance;
import creational.abstractfactory.storage.S3Storage;
import creational.abstractfactory.storage.Storage;

public class AwsResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capacityInMib) {
        return new S3Storage(capacityInMib);
    }
}
