package creational.singleton;

/**
 * This class demonstrates creational.singleton pattern using Double Checked Locking or "classic" creational.singleton.
 * This is also a lazy initializing creational.singleton.
 * Although this implementation solves the multi-threading issue with lazy initialization using volatile
 * and double check locking, the volatile keyword is guaranteed to work only after JVMs starting with
 * version 1.5 and later.
 */
public class LazyRegistryDCL {

    private static volatile LazyRegistryDCL INSTANCE;

    private LazyRegistryDCL() {
    }

    public static LazyRegistryDCL getInstance() {
        if (INSTANCE == null) {
            synchronized (LazyRegistryDCL.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazyRegistryDCL();
                }
            }
        }
        return INSTANCE;
    }
}
