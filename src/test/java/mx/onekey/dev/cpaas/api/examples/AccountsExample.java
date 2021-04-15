package mx.onekey.dev.cpaas.api.examples;

import mx.onekey.dev.cpaas.api.configuration.BasicZangConfiguration;
import mx.onekey.dev.cpaas.api.connectors.AccountsConnector;
import mx.onekey.dev.cpaas.api.connectors.ZangConnectorFactory;
import mx.onekey.dev.cpaas.api.domain.Account;
import mx.onekey.dev.cpaas.api.exceptions.ZangException;

public class AccountsExample {

    public static void main(String[] args) {
        BasicZangConfiguration conf = new BasicZangConfiguration();
        conf.setSid("{AccountSid}");
        conf.setAuthToken("{AuthToken}");
        AccountsConnector conn = new ZangConnectorFactory(conf).getAccountsConnector();

        //view account
        try {
            Account account = conn.viewAccount("{AccountSid}");
            System.out.println(account.getSid());
        } catch (ZangException e) {
            e.printStackTrace();

        }
        //update account
        try {
            Account account = conn.updateAccount("friendlyname1");
            System.out.println(account.getFriendlyName());
        } catch (ZangException e) {
            e.printStackTrace();
        }
    }
}
