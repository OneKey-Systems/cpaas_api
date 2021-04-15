package mx.onekey.dev.cpaas.api.domain.list;

import mx.onekey.dev.cpaas.api.domain.Call;
import mx.onekey.dev.cpaas.api.domain.ZangList;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class CallsList extends ZangList<Call> {

    @Override
    @JsonProperty("calls")
    protected void mapElements(List<Call> elements) {
        setElements(elements);
    }

}
