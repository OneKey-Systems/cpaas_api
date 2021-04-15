package mx.onekey.dev.cpaas.api.examples;

import mx.onekey.dev.cpaas.api.configuration.BasicZangConfiguration;
import mx.onekey.dev.cpaas.api.connectors.NotificationsConnector;
import mx.onekey.dev.cpaas.api.connectors.ZangConnectorFactory;
import mx.onekey.dev.cpaas.api.domain.Notification;
import mx.onekey.dev.cpaas.api.domain.enums.LogLevel;
import mx.onekey.dev.cpaas.api.domain.list.NotificationsList;
import mx.onekey.dev.cpaas.api.exceptions.ZangException;


public class NotificationsExample {

    public static void main(String[] args) {
        BasicZangConfiguration conf = new BasicZangConfiguration();
        conf.setSid("{AccountSid}");
        conf.setAuthToken("{AuthToken}");
        NotificationsConnector connector = ZangConnectorFactory.getNotificationsConnector(conf);

        //view notification
        try {
            Notification notification = connector.viewNotification("TestNotificationSid");
            System.out.println(notification.getMessageText());
        } catch (ZangException e) {
            e.printStackTrace();
        }


        //list notifications
        try {
            NotificationsList list = connector.listNotifications(LogLevel.INFO, 0, 33);
            for (Notification notification : list) {
                System.out.println(notification.getMessageText());
            }
        } catch (ZangException e) {
            e.printStackTrace();
        }

    }


}
