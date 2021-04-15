package mx.onekey.dev.cpaas.api.domain.list;

import mx.onekey.dev.cpaas.api.domain.IncomingPhoneNumber;
import mx.onekey.dev.cpaas.api.domain.ZangList;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class IncomingPhoneNumbersList extends ZangList<IncomingPhoneNumber> {

    @Override
    @JsonProperty("incoming_phone_numbers")
    protected void mapElements(List<IncomingPhoneNumber> elements) {
        setElements(elements);
    }

}
