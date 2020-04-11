package creational.abstractfactory.factory;

import creational.abstractfactory.instance.GoogleComputeEngineInstance;
import creational.abstractfactory.instance.Instance;
import creational.abstractfactory.storage.GoogleCloudStorage;
import creational.abstractfactory.storage.Storage;

public class GoogleCloudResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capacityInMib) {
        return new GoogleCloudStorage(capacityInMib);
    }
}
