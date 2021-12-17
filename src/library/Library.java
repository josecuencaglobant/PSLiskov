package library;

import java.util.ArrayList;

public class Library {

    public static void main(String[] args){

        var client = Client.createClientWithContactInformation(
                "México", "jose@email.com"
        );

        var sales = new Sales();

        var book = new Book();
        var comic = new Comic();
        var ebook =new EBook();

        var shoppingCar = new ArrayList<>();
        shoppingCar.add(book);
        shoppingCar.add(comic);
        shoppingCar.add(ebook);

        sales.sales(client,shoppingCar);

        //sales.physicalAndDigitalSales(client,shoppingCar);

        //sales.physicalSales(client,shoppingCar);
        //sales.digitalSales(client,shoppingCar);

    }

}
