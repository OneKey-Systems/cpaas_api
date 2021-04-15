package mx.onekey.dev.cpaas.api.unit;

import mx.onekey.dev.cpaas.api.connectors.UsagesConnector;
import mx.onekey.dev.cpaas.api.domain.enums.Product;
import mx.onekey.dev.cpaas.api.exceptions.ZangException;
import mx.onekey.dev.cpaas.api.params.ListUsagesParams;
import org.junit.Test;

import java.io.IOException;

public class UsagesTest extends BaseUnitTest {

    @Test
    public void viewUsage() throws ZangException, IOException {
        createExpectation("UsagesTest", "viewUsage");
        UsagesConnector connector = connectorFactory.getUsagesConnector();
        connector.viewUsage("TestUsageSid");

    }

    @Test
    public void listUsages() throws ZangException, IOException {
        createExpectation("UsagesTest", "listUsages");
        UsagesConnector connector = connectorFactory.getUsagesConnector();
        ListUsagesParams ur = ListUsagesParams.builder()
                .setPage(0)
                .setPageSize(25)
                .setProduct(Product.OUTBOUND_SMS)
                .setDay(12)
                .setMonth(12)
                .setYear(2016)
                .build();
        connector.listUsages(ur);

    }

}
