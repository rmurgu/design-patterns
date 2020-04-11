package creational.abstractfactory.factory;

import creational.abstractfactory.instance.Instance;
import creational.abstractfactory.storage.Storage;

public interface ResourceFactory {
    Instance createInstance(Instance.Capacity capacity);
    Storage createStorage(int capacityInMib);
}
