package mx.onekey.dev.cpaas.api.unit;

import mx.onekey.dev.cpaas.api.connectors.AccountsConnector;
import mx.onekey.dev.cpaas.api.domain.Account;
import mx.onekey.dev.cpaas.api.exceptions.ZangException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class AccountsTest extends BaseUnitTest {

    @Test
    public void viewAccount() throws ZangException, IOException {
        createExpectation("AccountsTest", "viewAccount");
        AccountsConnector connector = connectorFactory.getAccountsConnector();
        Account account = connector.viewAccount(conf.getSid());
        Assert.assertEquals("friendlyname1", account.getFriendlyName());
    }

    @Test
    public void updateAccount() throws ZangException, IOException {
        createExpectation("AccountsTest", "updateAccount");
        AccountsConnector connector = connectorFactory.getAccountsConnector();
        connector.updateAccount("friendlyname1");
    }

}
