package library;

public class Book  extends PhysicalProduct implements ProductSale {

    @Override
    public String deliverToHome(String address) {
        return "The Book will deliver in: " + address;
    }

    //Interface
    @Override
    public String deliverToUser(Client user) {
        return "The Book will deliver in: " + user.getAddress();
    }
}
