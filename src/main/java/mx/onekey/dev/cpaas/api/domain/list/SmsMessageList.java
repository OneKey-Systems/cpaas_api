package mx.onekey.dev.cpaas.api.domain.list;

import mx.onekey.dev.cpaas.api.domain.SmsMessage;
import mx.onekey.dev.cpaas.api.domain.ZangList;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class SmsMessageList extends ZangList<SmsMessage> {

    @Override
    @JsonProperty(value = "sms_messages")
    protected void mapElements(List<SmsMessage> elements) {
        setElements(elements);
    }

}
