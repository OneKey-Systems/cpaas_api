package mx.onekey.dev.cpaas.api.it;

import mx.onekey.dev.cpaas.api.connectors.TranscriptionsConnector;
import mx.onekey.dev.cpaas.api.domain.Transcription;
import mx.onekey.dev.cpaas.api.domain.enums.TranscriptionQuality;
import mx.onekey.dev.cpaas.api.domain.list.TranscriptionsList;
import mx.onekey.dev.cpaas.api.exceptions.ZangException;
import org.junit.Test;

public class TranscriptionIT extends BaseIntegrationTest {


    public TranscriptionIT() throws ZangException {
    }

    @Test
    public void transcribeAudioUrl() throws ZangException {
        TranscriptionsConnector conn = connectorFactory.getTranscriptionsConnector();
        conn.transcribeAudioUrl(testParameters.getMp3Url(), null, null, 0, 50, TranscriptionQuality.AUTO);
        TranscriptionsList list = conn.listTranscriptions();
        for(Transcription transcription : list) {
            System.out.println(transcription.getTranscriptionText());
        }
    }

}
