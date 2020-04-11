package creational.factorymethod;

public class XmlMessageFactory implements BaseFactory {
    @Override
    public Message buildMessage() {
        return new XmlMessage();
    }
}
