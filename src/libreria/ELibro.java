package libreria;

public class ELibro extends Producto{

    @Override
    public String entregaADomicilio(String direccion) {
        return "Soy un Elibro y no tengo entrega porque soy digital";
    }

    /*
    @Override
    public String envioDigital(String email) {
        return "El Elibro se envió a " + email;
    }

     */

}
