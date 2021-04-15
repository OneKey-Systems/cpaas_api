package mx.onekey.dev.cpaas.api.domain.list;

import mx.onekey.dev.cpaas.api.domain.Usage;
import mx.onekey.dev.cpaas.api.domain.ZangList;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class UsagesList extends ZangList<Usage> {

    @Override
    @JsonProperty("usages")
    protected void mapElements(List<Usage> elements) {
        setElements(elements);
    }

}
