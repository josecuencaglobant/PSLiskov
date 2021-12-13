package libreria;

import java.util.ArrayList;

public class Libreria {

    public static void main(String [] args) {
        var cliente = Cliente.crearClienteConDireccionFisicaYElectronica(
                "Rusia", "cliente@cliente.org");
        var ventas = new Ventas();

        var libro = new Libro();
        var historieta = new Historieta();
        var elibro = new ELibro();

        var carrito = new ArrayList<>();
        carrito.add(libro);
        carrito.add(historieta);
        carrito.add(elibro);

        ventas.venta(cliente,carrito);

    }




}
