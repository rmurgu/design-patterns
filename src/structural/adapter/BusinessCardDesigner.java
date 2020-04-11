package structural.adapter;

public class BusinessCardDesigner {

    public String designCard(Customer customer) {
        return customer.getName()
                + "\n" + customer.getDesignation()
                + "\n" + customer.getAddress();
    }
}
