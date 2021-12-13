package libreria;

public class Historieta extends Producto {

    @Override
    public String entregaADomicilio(String direccion) {
        return "La historieta se entrega en " + direccion;
    }


}
