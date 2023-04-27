import Utilidades.Combustible;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CuatroRuedasTest {
    @Test //descripcion de metodo y/o anotacion
    public void encenderCuatroRuedasTest() {
        CuatroRuedas cuatroRuedas = new CuatroRuedas(Combustible.GASOLINA); //constructor pide el tipo de combustible
        // si le doy TRUE a arrancarApagarVehiculo tiene que regresar TRUE
        boolean encendio = cuatroRuedas.arracarapagarVehiculo(true);
        Assert.assertEquals(encendio, true);
    }
    @Test
    public void tipoCombustibleGasolinaTest() {
        CuatroRuedas cuatroRuedas = new CuatroRuedas(Combustible.GASOLINA);
        System.out.println(cuatroRuedas.getCombustible());
        Assert.assertEquals(cuatroRuedas.getCombustible(), Combustible.GASOLINA);
    }
    @Test
    public void tipoCombustibleIsNotTurbosina(){
        CuatroRuedas cuatroRuedas = new CuatroRuedas(Combustible.GASOLINA);
        System.out.println(cuatroRuedas.getCombustible());
        Assert.assertNotEquals(cuatroRuedas.getCombustible(), Combustible.TURBOSINA);
    }
}
