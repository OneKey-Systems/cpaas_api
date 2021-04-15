package mx.onekey.dev.cpaas.api.it;

import mx.onekey.dev.cpaas.api.connectors.AvailablePhoneNumbersConnector;
import mx.onekey.dev.cpaas.api.connectors.IncomingPhoneNumbersConnector;
import mx.onekey.dev.cpaas.api.domain.enums.AvailableNumberType;
import mx.onekey.dev.cpaas.api.domain.list.AvailablePhoneNumbersList;
import mx.onekey.dev.cpaas.api.domain.list.IncomingPhoneNumbersList;
import mx.onekey.dev.cpaas.api.exceptions.ZangException;
import mx.onekey.dev.cpaas.api.params.ListAvailableNumbersParams;
import org.junit.Test;

public class PhoneNumbersIT extends BaseIntegrationTest {


    public PhoneNumbersIT() throws ZangException {
    }

    @Test
    public void incomingPhoneNumbers() throws ZangException {
        IncomingPhoneNumbersConnector conn = connectorFactory.getIncomingPhoneNumbersConnector();
        IncomingPhoneNumbersList list = conn.listIncomingNumbers(null, null, 0, 25);
        if (list.getTotal() > 0) {
            conn.viewIncomingNumber(list.iterator().next().getSid());
        }
    }

    @Test
    public void availablePhoneNumbers() throws ZangException {
        AvailablePhoneNumbersConnector conn = connectorFactory.getAvailablePhoneNumbersConnector();
        AvailablePhoneNumbersList list = conn.listAvailableNumbers(ListAvailableNumbersParams.builder()
                .setCountry("HR")
                .setType(AvailableNumberType.LOCAL)
                .build());
        System.out.println(list.getTotal());
    }

}
