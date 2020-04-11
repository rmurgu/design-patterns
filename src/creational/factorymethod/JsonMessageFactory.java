package creational.factorymethod;

public class JsonMessageFactory implements BaseFactory {
    @Override
    public Message buildMessage() {
        return new JsonMessage();
    }
}
