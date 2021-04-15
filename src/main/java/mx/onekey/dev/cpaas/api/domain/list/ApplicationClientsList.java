package mx.onekey.dev.cpaas.api.domain.list;

import mx.onekey.dev.cpaas.api.domain.ApplicationClient;
import mx.onekey.dev.cpaas.api.domain.ZangList;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class ApplicationClientsList extends ZangList<ApplicationClient> {

    @Override
    @JsonProperty("clients")
    protected void mapElements(List<ApplicationClient> elements) {
        setElements(elements);
    }

}
