import Utilidades.Combustible;
import org.testng.Assert;
import org.testng.annotations.Test;
public class AereoTest {
    @Test //descripcion de metodo y/o anotacion
    public void encenderCuatroRuedasTest() {
        Aereo aereo = new Aereo(Combustible.TURBOSINA); //constructor pide el tipo de combustible
        // si le doy TRUE a arrancarApagarVehiculo tiene que regresar TRUE
        boolean encendio = aereo.arracarapagarVehiculo(true);
        Assert.assertEquals(encendio, true);
    }
    @Test
    public void tipoCombustibleGasolinaTest() {
        Aereo aereo = new Aereo(Combustible.TURBOSINA);
        System.out.println(aereo.getCombustible());
        Assert.assertEquals(aereo.getCombustible(), Combustible.TURBOSINA);
    }
    @Test
    public void tipoCombustibleIsNotTurbosina(){
        Aereo aereo = new Aereo(Combustible.TURBOSINA);
        System.out.println(aereo.getCombustible());
        Assert.assertNotEquals(aereo.getCombustible(), Combustible.GASOIL);
    }
}