package library;

public class Client {

    public static Client createClientWithContactInformation(String address, String email){
        return new Client(address,email);
    }

    private String address;
    private String email;

    public Client(String address, String email){
        this.address = address;
        this.email = email;
    }

    public String getAddress(){
        return address;
    }

    public String getEmail(){
        return email;
    }

}
