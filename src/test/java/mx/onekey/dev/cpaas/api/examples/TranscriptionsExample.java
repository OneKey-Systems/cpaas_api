package mx.onekey.dev.cpaas.api.examples;

import mx.onekey.dev.cpaas.api.configuration.BasicZangConfiguration;
import mx.onekey.dev.cpaas.api.connectors.TranscriptionsConnector;
import mx.onekey.dev.cpaas.api.connectors.ZangConnectorFactory;
import mx.onekey.dev.cpaas.api.domain.Transcription;
import mx.onekey.dev.cpaas.api.domain.enums.HttpMethod;
import mx.onekey.dev.cpaas.api.domain.enums.TranscriptionQuality;
import mx.onekey.dev.cpaas.api.domain.enums.TranscriptionStatus;
import mx.onekey.dev.cpaas.api.domain.list.TranscriptionsList;
import mx.onekey.dev.cpaas.api.exceptions.ZangException;
import mx.onekey.dev.cpaas.api.testutil.TestParameters;


public class TranscriptionsExample {

    public static void main(String[] args) {
        BasicZangConfiguration conf = new BasicZangConfiguration();
        conf.setSid("{AccountSid}");
        conf.setAuthToken("{AuthToken}");
        TranscriptionsConnector connector = ZangConnectorFactory.getTranscriptionsConnector(conf);

        //view transcription
        try {
            Transcription transcription = connector.viewTranscription("TestTranscriptionSid");
            System.out.println(transcription.getPrice());
        } catch (ZangException e) {
            e.printStackTrace();
        }

        //list transcriptions
        try {
            TranscriptionsList transcriptionsList = connector.listTranscriptions(TranscriptionStatus.COMPLETED,
                    TestParameters.getFromDate(),
                    TestParameters.getToDate(), 0, 33);
            System.out.println(transcriptionsList.getTotal());
        } catch (ZangException e) {
            e.printStackTrace();
        }

        //transcribe recording
        try {
            Transcription transcription = connector.transcribeRecording("TestRecordingSid",
                    "TranscribeCallback",
                    HttpMethod.GET, 0, 33, TranscriptionQuality.HYBRID);
            System.out.println(transcription.getDuration());
        } catch (ZangException e) {
            e.printStackTrace();
        }


        //transcribe audio url
        try {
            Transcription transcription = connector.transcribeAudioUrl("AudioURl",
                    "TranscribeCallback",
                    HttpMethod.GET, 0, 33, TranscriptionQuality.AUTO);
            System.out.println(transcription.getStatus());
        } catch (ZangException e) {
            e.printStackTrace();
        }
    }

}
