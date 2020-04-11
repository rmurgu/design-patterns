package creational.factorymethod;

public class App {

    public static void main(String[] args) {
        System.out.println(getMessage(new XmlMessageFactory()));
    }

    public static Message getMessage(BaseFactory factory) {
        return factory.buildMessage();
    }
}
