package creational.singleton;

/**
 * (Ref. Google I/O 2k8 Joshua Bloch)
 * Since Java 1.5 using enum is clean way to create a creational.singleton. It handles serialization using java's in-built
 * mechanism and still ensure single instance
 */
public enum RegistryEnum {

    INSTANCE;

    // add desired methods

    public void getConfiguration(){

    }
}
