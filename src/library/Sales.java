package library;

import java.util.ArrayList;

public class Sales {

    public void sales(Client client, ArrayList<Object> shoppingCar){
        for(Object product: shoppingCar){
            if(product instanceof Product){
                String result = ( (Product) product )
                        .deliverToHome( client.getAddress() );
                System.out.println(result);
            }
        }
    }

    public void physicalAndDigitalSales(Client client, ArrayList<Object> shoppingCar){
        for(Object product: shoppingCar){

            if(product instanceof PhysicalProduct){
                String result = ( (PhysicalProduct) product )
                        .deliverToHome(client.getAddress());
                System.out.println(result);
            }

            if(product instanceof DigitalProduct){
                String result = ( (DigitalProduct) product )
                        .sendByEmail(client.getEmail());
                System.out.println(result);
            }

        }
    }

    public void physicalSales(Client client, ArrayList<Object> shoppingCar){
        for(Object product: shoppingCar){

            if(product instanceof PhysicalProduct){
                String result = ( (PhysicalProduct) product )
                        .deliverToHome(client.getAddress());
                System.out.println(result);
            }

        }
    }

    public void digitalSales(Client client, ArrayList<Object> shoppingCar){
        for(Object product: shoppingCar){

            if(product instanceof DigitalProduct){
                String result = ( (DigitalProduct) product )
                        .sendByEmail(client.getEmail());
                System.out.println(result);
            }

        }
    }


}
