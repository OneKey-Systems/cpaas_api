package mx.onekey.dev.cpaas.api.domain.list;

import mx.onekey.dev.cpaas.api.domain.AvailablePhoneNumber;
import mx.onekey.dev.cpaas.api.domain.ZangList;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class AvailablePhoneNumbersList extends ZangList<AvailablePhoneNumber> {

    @Override
    @JsonProperty("available_phone_numbers")
    protected void mapElements(List<AvailablePhoneNumber> elements) {
        setElements(elements);
    }

}
