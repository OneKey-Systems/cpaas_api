package mx.onekey.dev.cpaas.api.domain.list;

import mx.onekey.dev.cpaas.api.domain.Notification;
import mx.onekey.dev.cpaas.api.domain.ZangList;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class NotificationsList extends ZangList<Notification> {

    @Override
    @JsonProperty("notifications")
    protected void mapElements(List<Notification> elements) {
        setElements(elements);
    }

}
