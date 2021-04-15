package mx.onekey.dev.cpaas.api.it;

import mx.onekey.dev.cpaas.api.connectors.CarrierServicesConnector;
import mx.onekey.dev.cpaas.api.exceptions.ZangException;
import org.junit.Test;

public class CarrierServicesIT extends BaseIntegrationTest {


    private final CarrierServicesConnector conn;

    public CarrierServicesIT() throws ZangException {
        conn = connectorFactory.getCarrierServicesConnector();
    }

    @Test
    public void carrierLookup() throws ZangException {
        conn.carrierLookup("1-408-647-4636");
        conn.listCarrierLookups(0, 50);
    }

    @Test
    public void bnaLookup() throws ZangException {
        conn.bnaLookup("1-408-647-4636");
        conn.listBnaLookups(0, 50);
    }

    @Test
    public void cnamLookup() throws ZangException {
        //conn.cnamLookup("+14086474636");
        conn.listCnamLookups(0, 50);
    }

}
