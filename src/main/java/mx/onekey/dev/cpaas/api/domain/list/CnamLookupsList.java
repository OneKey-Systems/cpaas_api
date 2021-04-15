package mx.onekey.dev.cpaas.api.domain.list;

import mx.onekey.dev.cpaas.api.domain.CnamLookup;
import mx.onekey.dev.cpaas.api.domain.ZangList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CnamLookupsList extends ZangList<CnamLookup> {

    @Override
    @JsonProperty("cnam_dips")
    protected void mapElements(List<CnamLookup> elements) {
        setElements(elements);
    }

}
