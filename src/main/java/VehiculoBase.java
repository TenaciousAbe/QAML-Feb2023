import Utilidades.Combustible;

public class VehiculoBase {
    private Combustible Combustible;
    public String Modelo;
    public String Marca;
    public int numeroLlantas;
    public VehiculoBase(Combustible tipoCombustible){
        this.Combustible = tipoCombustible;
    }
    public boolean arracarapagarVehiculo(boolean encender) {
        System.out.println("El vehiculo se necesita encender: " + encender);
        if (encender) {
            System.out.println("Vehiculo encendido.");
            return true;
        } else {
            System.out.println("Vehiculo apagado.");
            return false;
        }
    }
    public Combustible getCombustible() {
        return this.Combustible;
    }
}
//Crear un objeto tipo maritimo, aereo, 4 ruedas con sus tests
//con al menos tres tests
