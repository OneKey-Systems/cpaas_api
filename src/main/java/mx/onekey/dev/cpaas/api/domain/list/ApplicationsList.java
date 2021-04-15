package mx.onekey.dev.cpaas.api.domain.list;

import mx.onekey.dev.cpaas.api.domain.Application;
import mx.onekey.dev.cpaas.api.domain.ZangList;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class ApplicationsList extends ZangList<Application> {

    @Override
    @JsonProperty("applications")
    protected void mapElements(List<Application> elements) {
        setElements(elements);
    }

}
