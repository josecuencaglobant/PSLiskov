package library;

public class Comic extends Product {

    @Override
    public String deliverToHome(String address) {
        return "The Comic will deliver in: " + address;
    }

}
