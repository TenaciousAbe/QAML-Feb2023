import Utilidades.TipoPasajeroEnum;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PasajeroTest {
    @Test
    public void nombrePasajeroTest(){
        String nombreEsperado = "Pablo Aguilar";
        TipoPasajeroEnum tipoPasajeroEsperado = TipoPasajeroEnum.VIP;

        Pasajero pabloAguilar = new Pasajero();
        pabloAguilar.setPasajeroNombre(nombreEsperado);
        pabloAguilar.setTipoPasajero(tipoPasajeroEsperado);

        String nombreActual = pabloAguilar.getPasajeroNombre();
        TipoPasajeroEnum tipoPasajeroActual = pabloAguilar.getTipoPasajero();

        Assert.assertEquals(nombreActual, nombreEsperado);
        Assert.assertEquals(tipoPasajeroActual, tipoPasajeroEsperado);
    }
    @Test
    public void tipoPasajeroTestNoEsVIP(){
        String nombreEsperado = "Esther Gonzalez";
        TipoPasajeroEnum tipoPasajeroEsperado = TipoPasajeroEnum.PREMIUM;

        Pasajero estherGonzalez = new Pasajero();
        estherGonzalez.setPasajeroNombre(nombreEsperado);
        estherGonzalez.setTipoPasajero(TipoPasajeroEnum.VIP);

        String nombreActual = estherGonzalez.getPasajeroNombre();
        TipoPasajeroEnum tipoPasajeroActual = estherGonzalez.getTipoPasajero();

        Assert.assertEquals(nombreActual, nombreEsperado);
        Assert.assertNotEquals(tipoPasajeroActual, tipoPasajeroEsperado);
    }
}
