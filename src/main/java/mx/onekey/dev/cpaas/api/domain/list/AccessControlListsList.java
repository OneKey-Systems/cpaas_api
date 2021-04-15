package mx.onekey.dev.cpaas.api.domain.list;

import mx.onekey.dev.cpaas.api.domain.AccessControlList;
import mx.onekey.dev.cpaas.api.domain.ZangList;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class AccessControlListsList extends ZangList<AccessControlList> {

    @Override
    @JsonProperty("ip_access_control")
    protected void mapElements(List<AccessControlList> elements) {
        setElements(elements);
    }

}
