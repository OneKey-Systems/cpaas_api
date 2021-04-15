package mx.onekey.dev.cpaas.api.it;

import mx.onekey.dev.cpaas.api.connectors.NotificationsConnector;
import mx.onekey.dev.cpaas.api.domain.list.NotificationsList;
import mx.onekey.dev.cpaas.api.exceptions.ZangException;
import org.junit.Test;

public class NotificationsIT extends BaseIntegrationTest {


    public NotificationsIT() throws ZangException {
    }

    @Test
    public void notifications() throws ZangException {
        NotificationsConnector conn = connectorFactory.getNotificationsConnector();
        NotificationsList list = conn.listNotifications();
        if (list.getTotal() > 0) {
            conn.viewNotification(list.iterator().next().getSid());
        }
    }

}
