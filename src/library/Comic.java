package library;

public class Comic extends PhysicalProduct implements ProductSale {

    @Override
    public String deliverToHome(String address) {
        return "The Comic will deliver in: " + address;
    }

    @Override
    public String deliverToUser(Client user) {
        return "The Book will deliver in: " + user.getAddress();
    }

}
