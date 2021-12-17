package library;

public class Book  extends Product{

    @Override
    public String deliverToHome(String address) {
        return "The Book will deliver in: " + address;
    }
}
