package library;

public class EBook extends Product {

    @Override
    public String deliverToHome(String address) {
        return "The Ebook will deliver in: " + address;
    }



    /*
    @Override
    public String sendByEmail(String email) {
        return "The Ebook will send to " + email;
    }

     */


}
