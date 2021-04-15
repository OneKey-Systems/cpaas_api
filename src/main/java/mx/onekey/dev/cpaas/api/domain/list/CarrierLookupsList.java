package mx.onekey.dev.cpaas.api.domain.list;

import mx.onekey.dev.cpaas.api.domain.CarrierLookup;
import mx.onekey.dev.cpaas.api.domain.ZangList;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class CarrierLookupsList extends ZangList<CarrierLookup> {

    @Override
    @JsonProperty("carrier_lookups")
    protected void mapElements(List<CarrierLookup> elements) {
        setElements(elements);
    }

}
