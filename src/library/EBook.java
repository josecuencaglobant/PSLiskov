package library;

public class EBook extends DigitalProduct implements ProductSale {

    /*
    @Override
    public String deliverToHome(String address) {
        return "The Ebook will deliver in: " + address;
    }

     */

    @Override
    public String sendByEmail(String email) {
        return "The Ebook will send to " + email;
    }

    @Override
    public String deliverToUser(Client user) {
        return "The Ebook will send to " + user.getEmail();
    }

}
