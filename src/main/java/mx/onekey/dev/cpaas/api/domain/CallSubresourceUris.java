package mx.onekey.dev.cpaas.api.domain;

/**
 * List of a calls various subresources and their URI path. Examples of call
 * subresources are notifications, recordings, etc.
 *
 */
public class CallSubresourceUris {

    private String notifications;
    private String recordings;

    public String getNotifications() {
        return notifications;
    }
    public void setNotifications(String notifications) {
        this.notifications = notifications;
    }
    public String getRecordings() {
        return recordings;
    }
    public void setRecordings(String recordings) {
        this.recordings = recordings;
    }


}