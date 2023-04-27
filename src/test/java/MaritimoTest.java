import Utilidades.Combustible;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MaritimoTest {
    @Test //descripcion de metodo y/o anotacion
    public void encenderCuatroRuedasTest() {
        Maritimo maritimo = new Maritimo(Combustible.GASOIL); //constructor pide el tipo de combustible
        // si le doy TRUE a arrancarApagarVehiculo tiene que regresar TRUE
        boolean encendio = maritimo.arracarapagarVehiculo(true);
        Assert.assertEquals(encendio, true);
    }
    @Test
    public void tipoCombustibleGasolinaTest() {
        Maritimo maritimo = new Maritimo(Combustible.GASOIL);
        System.out.println(maritimo.getCombustible());
        Assert.assertEquals(maritimo.getCombustible(), Combustible.GASOIL);
    }
    @Test
    public void tipoCombustibleIsNotTurbosina(){
        Maritimo maritimo = new Maritimo(Combustible.GASOIL);
        System.out.println(maritimo.getCombustible());
        Assert.assertNotEquals(maritimo.getCombustible(), Combustible.TURBOSINA);
    }
}