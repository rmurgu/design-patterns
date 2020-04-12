package structural.decorator;

public class Client {

    public static void main(String[] args) {
        Message message = new TextMessage("Live long and prosper");
        System.out.println(message.getContent());

        message = new HtmlEncodedMessage(message);
        System.out.println(message.getContent());

    }
}
