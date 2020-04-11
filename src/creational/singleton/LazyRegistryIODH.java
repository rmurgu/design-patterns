package creational.singleton;

/**
 * Singleton pattern using lazy initialization holder class. This ensures that, we have a lazy initialization
 * without worrying about synchronization.
 */
public class LazyRegistryIODH {

    private LazyRegistryIODH() {
        System.out.println("In LazyRegistryIODH creational.singleton");
    }

    private static class RegistryHolder {
        static final LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
    }

    public static LazyRegistryIODH getInstance() {
        return RegistryHolder.INSTANCE;
    }
}
