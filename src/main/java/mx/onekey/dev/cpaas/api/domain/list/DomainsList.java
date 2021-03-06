package mx.onekey.dev.cpaas.api.domain.list;

import mx.onekey.dev.cpaas.api.domain.Domain;
import mx.onekey.dev.cpaas.api.domain.ZangList;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class DomainsList extends ZangList<Domain> {

    @Override
    @JsonProperty("domains")
    protected void mapElements(List<Domain> elements) {
        setElements(elements);
    }

}
