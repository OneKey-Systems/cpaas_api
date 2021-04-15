package mx.onekey.dev.cpaas.api.examples;

import mx.onekey.dev.cpaas.api.configuration.BasicZangConfiguration;
import mx.onekey.dev.cpaas.api.connectors.ApplicationClientsConnector;
import mx.onekey.dev.cpaas.api.connectors.ZangConnectorFactory;
import mx.onekey.dev.cpaas.api.domain.ApplicationClient;
import mx.onekey.dev.cpaas.api.domain.list.ApplicationClientsList;
import mx.onekey.dev.cpaas.api.exceptions.ZangException;

public class ApplicationClientsExample {

    public static void main(String[] args) {
        BasicZangConfiguration conf = new BasicZangConfiguration();
        conf.setSid("{AccountSid}");
        conf.setAuthToken("{AuthToken}");
        ApplicationClientsConnector conn = ZangConnectorFactory.getApplicationClientsConnector(conf);


        // view application client
        try {
            ApplicationClient applicationClient = conn.viewApplicationClient("TestApplicationSid",
                    "TestApplicationClientSid");
        } catch (ZangException e) {
            e.printStackTrace();
        }


        // list application clients
        try {
            ApplicationClientsList applicationClients = conn.listApplicationClients("TestAccountSid",
                    "TestApplicationSid", 0, 10);
        } catch (ZangException e) {
            e.printStackTrace();
        }

        // create application client
        try {
            ApplicationClient applicationClient = conn.createApplicationClient("TestApplicationSid",
                    "MyApplicationClient");
        } catch (ZangException e) {
            e.printStackTrace();
        }
    }
}
