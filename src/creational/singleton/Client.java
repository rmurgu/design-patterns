package creational.singleton;

public class Client {

    public static void main(String[] args) {
        LazyRegistryIODH lazyRegistryIODH;
        lazyRegistryIODH = LazyRegistryIODH.getInstance();

        System.out.println(lazyRegistryIODH);
    }
}
