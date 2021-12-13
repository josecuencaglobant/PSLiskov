package libreria;

import java.util.ArrayList;

public class Ventas {

    public void venta(Cliente cliente, ArrayList<Object> carrito){

        for(Object producto: carrito){

                if(producto instanceof Producto){
                    String estadoVenta = ( (Producto) producto ).entregaADomicilio(cliente.getDireccion());
                    System.out.println(estadoVenta);
                }


                /*
                if(producto instanceof ProductoFisico){
                    String estadoVenta = ( (ProductoFisico) producto ).entregaADomicilio(cliente.getDireccion());
                    System.out.println(estadoVenta);
                }

                if(producto instanceof ProductoDigital){
                    String estadoVenta = ( (ProductoDigital) producto ).envioDigital(cliente.getEmail());
                    System.out.println(estadoVenta);
                }

                 */

        }
    }

}
