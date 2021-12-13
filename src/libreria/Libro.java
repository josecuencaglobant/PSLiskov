package libreria;

public class Libro extends Producto {

    @Override
    public String entregaADomicilio(String direccion){
        return "El libro se entrega en: " + direccion;
    }

}
