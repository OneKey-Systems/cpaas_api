package mx.onekey.dev.cpaas.api.domain.list;

import mx.onekey.dev.cpaas.api.domain.IpAddress;
import mx.onekey.dev.cpaas.api.domain.ZangList;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class IpAddressesList extends ZangList<IpAddress> {

    @Override
    @JsonProperty("ip_addresses")
    protected void mapElements(List<IpAddress> elements) {
        setElements(elements);
    }

}
