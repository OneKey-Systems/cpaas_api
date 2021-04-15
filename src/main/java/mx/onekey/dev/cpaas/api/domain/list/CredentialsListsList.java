package mx.onekey.dev.cpaas.api.domain.list;

import mx.onekey.dev.cpaas.api.domain.CredentialsList;
import mx.onekey.dev.cpaas.api.domain.ZangList;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class CredentialsListsList extends ZangList<CredentialsList> {

    @Override
    @JsonProperty("credential_lists")
    protected void mapElements(List<CredentialsList> elements) {
        setElements(elements);
    }

}
