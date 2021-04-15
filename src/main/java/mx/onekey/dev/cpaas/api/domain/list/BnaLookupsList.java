package mx.onekey.dev.cpaas.api.domain.list;

import mx.onekey.dev.cpaas.api.domain.BnaLookup;
import mx.onekey.dev.cpaas.api.domain.ZangList;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class BnaLookupsList extends ZangList<BnaLookup> {

    @Override
    @JsonProperty("bna_lookups")
    protected void mapElements(List<BnaLookup> elements) {
        setElements(elements);
    }

}
