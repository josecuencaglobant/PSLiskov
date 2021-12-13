package libreria;

public class Cliente {

    public static Cliente crearClienteConDireccionFisicaYElectronica(String direccion, String email){
        return new Cliente(direccion, email);
    }

    private String direccion;
    private String email;

    public Cliente(String direccion, String email){
        this.direccion = direccion;
        this.email = email;
    }

    public String getDireccion(){
        return this.direccion;
    }
    public String getEmail(){ return this.email; }

}
