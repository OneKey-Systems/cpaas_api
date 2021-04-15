package mx.onekey.dev.cpaas.api.unit;

import mx.onekey.dev.cpaas.api.connectors.NotificationsConnector;
import mx.onekey.dev.cpaas.api.domain.Notification;
import mx.onekey.dev.cpaas.api.domain.enums.LogLevel;
import mx.onekey.dev.cpaas.api.exceptions.ZangException;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;


public class NotificationsTest extends BaseUnitTest {

    private NotificationsConnector connector;

    @Before
    public void initConnector() {
        connector = connectorFactory.getNotificationsConnector();
    }

    @Test
    public void viewNotification() throws ZangException, IOException {
        createExpectation("NotificationsTest", "viewNotification");
        checkNotification(connector.viewNotification("TestNotificationSid"));
    }

    @Test
    public void listNotifications() throws ZangException, IOException {
        createExpectation("NotificationsTest", "listNotifications");
        connector.listNotifications(LogLevel.INFO, 0, 33);
    }


    private void checkNotification(Notification notification) {

    }

}
