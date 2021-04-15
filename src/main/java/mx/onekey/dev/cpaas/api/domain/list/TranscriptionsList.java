package mx.onekey.dev.cpaas.api.domain.list;

import mx.onekey.dev.cpaas.api.domain.Transcription;
import mx.onekey.dev.cpaas.api.domain.ZangList;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class TranscriptionsList extends ZangList<Transcription> {

    @Override
    @JsonProperty("transcriptions")
    protected void mapElements(List<Transcription> elements) {
        setElements(elements);
    }

}
