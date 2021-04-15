package mx.onekey.dev.cpaas.api.domain.list;

import mx.onekey.dev.cpaas.api.domain.Recording;
import mx.onekey.dev.cpaas.api.domain.ZangList;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class RecordingsList extends ZangList<Recording> {

    @Override
    @JsonProperty("recordings")
    protected void mapElements(List<Recording> elements) {
        setElements(elements);
    }

}
