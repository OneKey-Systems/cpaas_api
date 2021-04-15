package mx.onekey.dev.cpaas.api.domain.list;

import mx.onekey.dev.cpaas.api.domain.Conference;
import mx.onekey.dev.cpaas.api.domain.ZangList;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class ConferencesList extends ZangList<Conference> {

    @Override
    @JsonProperty("conferences")
    protected void mapElements(List<Conference> elements) {
        setElements(elements);
    }

}
