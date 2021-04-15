package mx.onekey.dev.cpaas.api.unit;

import mx.onekey.dev.cpaas.api.connectors.AvailablePhoneNumbersConnector;
import mx.onekey.dev.cpaas.api.domain.AvailablePhoneNumber;
import mx.onekey.dev.cpaas.api.domain.enums.AvailableNumberType;
import mx.onekey.dev.cpaas.api.exceptions.ZangException;
import mx.onekey.dev.cpaas.api.params.ListAvailableNumbersParams;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;


public class AvailablePhoneNumbersTest extends BaseUnitTest {

    private AvailablePhoneNumbersConnector connector;

    @Before
    public void initConnector() {
        connector = connectorFactory.getAvailablePhoneNumbersConnector();
    }

    @Test
    public void listAvailablePhoneNumbers() throws ZangException, IOException {
        createExpectation("AvailablePhoneNumbersTest", "listAvailablePhoneNumbers");
        checkAvailablePhoneNumber(connector.listAvailableNumbers(ListAvailableNumbersParams.builder()
                .setCountry("HR")
                .setType(AvailableNumberType.TOLLFREE)
                .setContains("123")
                .setAreaCode("052")
                .setInRegion("Istria")
                .setInPostalCode("52210")
                .setPage(0)
                .setPageSize(20)
                .build()).iterator().next());
    }


    private void checkAvailablePhoneNumber(AvailablePhoneNumber availablePhoneNumber) {
        Assert.assertEquals("HR", availablePhoneNumber.getIsoCountry());

    }

}
