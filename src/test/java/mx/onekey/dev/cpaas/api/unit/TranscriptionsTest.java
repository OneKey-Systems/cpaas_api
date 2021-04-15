package mx.onekey.dev.cpaas.api.unit;

import mx.onekey.dev.cpaas.api.connectors.TranscriptionsConnector;
import mx.onekey.dev.cpaas.api.domain.Transcription;
import mx.onekey.dev.cpaas.api.domain.enums.HttpMethod;
import mx.onekey.dev.cpaas.api.domain.enums.TranscriptionQuality;
import mx.onekey.dev.cpaas.api.domain.enums.TranscriptionStatus;
import mx.onekey.dev.cpaas.api.exceptions.ZangException;
import mx.onekey.dev.cpaas.api.testutil.TestParameters;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;


public class TranscriptionsTest extends BaseUnitTest {

    private TranscriptionsConnector connector;

    @Before
    public void initConnector() {
        connector = connectorFactory.getTranscriptionsConnector();
    }

    @Test
    public void viewTranscription() throws ZangException, IOException {
        createExpectation("TranscriptionsTest", "viewTranscription");
        checkTranscription(connector.viewTranscription("TestTranscriptionSid"));
    }

    @Test
    public void listTranscriptions() throws ZangException, IOException {
        createExpectation("TranscriptionsTest", "listTranscriptions");
        connector.listTranscriptions(TranscriptionStatus.COMPLETED, TestParameters.getFromDate(), TestParameters.getToDate(), 0, 33);
    }

    @Test
    public void transcribeRecording() throws ZangException, IOException {
        createExpectation("TranscriptionsTest", "transcribeRecording");
        checkTranscription(connector.transcribeRecording("TestRecordingSid",
                "TranscribeCallback",
                HttpMethod.GET, 0, 33, TranscriptionQuality.HYBRID));
    }

    @Test
    public void transcribeAudioUrl() throws ZangException, IOException {
        createExpectation("TranscriptionsTest", "transcribeAudioUrl");
        checkTranscription(connector.transcribeAudioUrl("AudioURl",
                "TranscribeCallback",
                HttpMethod.GET, 0, 33, TranscriptionQuality.AUTO));
    }


    private void checkTranscription(Transcription transcription) {
    }

}
