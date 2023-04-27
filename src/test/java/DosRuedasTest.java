import Utilidades.Combustible;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DosRuedasTest {
    @Test //descripcion de metodo y/o anotacion
    public void encenderDosRuedasTest() {
        DosRuedas dosRuedas = new DosRuedas(Combustible.GASOLINA); //constructor pide el tipo de combustible
        // si le doy TRUE a arrancarApagarVehiculo tiene que regresar TRUE
        boolean encendio = dosRuedas.arracarapagarVehiculo(true);
        Assert.assertEquals(encendio, true);
    }
    @Test
    public void tioCombustibleGasolinaTest() {
        DosRuedas dosRuedas = new DosRuedas(Combustible.GASOLINA);
        System.out.println(dosRuedas.getCombustible());
        Assert.assertEquals(dosRuedas.getCombustible(), Combustible.GASOLINA);
    }
    @Test
    public void tipoCombustibleIsNotTurbosina(){
        DosRuedas dosRuedas = new DosRuedas(Combustible.GASOLINA);
        System.out.println(dosRuedas.getCombustible());
        Assert.assertNotEquals(dosRuedas.getCombustible(), Combustible.TURBOSINA);
    }
}
