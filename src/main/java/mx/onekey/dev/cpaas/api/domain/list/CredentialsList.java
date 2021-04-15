package mx.onekey.dev.cpaas.api.domain.list;

import mx.onekey.dev.cpaas.api.domain.Credential;
import mx.onekey.dev.cpaas.api.domain.ZangList;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class CredentialsList extends ZangList<Credential> {

    @Override
    @JsonProperty("credentials")
    protected void mapElements(List<Credential> elements) {
        setElements(elements);
    }

}
