package mx.onekey.dev.cpaas.api.examples;

import mx.onekey.dev.cpaas.api.configuration.BasicZangConfiguration;
import mx.onekey.dev.cpaas.api.connectors.RecordingsConnector;
import mx.onekey.dev.cpaas.api.connectors.ZangConnectorFactory;
import mx.onekey.dev.cpaas.api.domain.Recording;
import mx.onekey.dev.cpaas.api.domain.enums.RecordingAudioDirection;
import mx.onekey.dev.cpaas.api.domain.enums.TranscriptionQuality;
import mx.onekey.dev.cpaas.api.domain.list.RecordingsList;
import mx.onekey.dev.cpaas.api.exceptions.ZangException;
import mx.onekey.dev.cpaas.api.inboundxml.elements.enums.RecordingFileFormat;
import mx.onekey.dev.cpaas.api.params.RecordCallParams;
import mx.onekey.dev.cpaas.api.testutil.TestParameters;


public class RecordingsExample {

    public static void main(String[] args) {
        BasicZangConfiguration conf = new BasicZangConfiguration();
        conf.setSid("{AccountSid}");
        conf.setAuthToken("{AuthToken}");
        RecordingsConnector connector = ZangConnectorFactory.getRecordingsConnector(conf);

        //view recording
        try {
            Recording recording = connector.viewRecording("TestRecordingSid");
            System.out.println(recording.getDuration());
        } catch (ZangException e) {
            e.printStackTrace();
        }


        //list recordings
        try {
            RecordingsList recordingsList = connector.listRecordings("TestCallSid", TestParameters.getFromDate(),
                    TestParameters.getToDate(), 0, 33);
            System.out.println(recordingsList.getTotal());
        } catch (ZangException e) {
            e.printStackTrace();
        }

        //record call
        try {
            Recording recording = connector.recordCall(RecordCallParams.builder()
                    .setCallSid("TestCallSid")
                    .setRecord(true)
                    .setDirection(RecordingAudioDirection.OUT)
                    .setTimeLimit(1337)
                    .setCallbackUrl("CallbackUrl")
                    .setFileFormat(RecordingFileFormat.WAV)
                    .setTrimSilence(true)
                    .setTranscribe(true)
                    .setTranscriptionQuality(TranscriptionQuality.HYBRID)
                    .setTranscribeCallback("TranscribeCallback")
                    .build());
            System.out.println(recording.getSid());
        } catch (ZangException e) {
            e.printStackTrace();
        }

        //delete recording
        try {
            Recording recording = connector.deleteRecording("TestRecordingSid");
            System.out.println(recording.getPrice());
        } catch (ZangException e) {
            e.printStackTrace();
        }
    }

}
