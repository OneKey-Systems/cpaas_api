package mx.onekey.dev.cpaas.api.domain.list;

import mx.onekey.dev.cpaas.api.domain.Participant;
import mx.onekey.dev.cpaas.api.domain.ZangList;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class ParticipantsList extends ZangList<Participant> {

    @Override
    @JsonProperty("participants")
    protected void mapElements(List<Participant> elements) {
        setElements(elements);
    }

}
