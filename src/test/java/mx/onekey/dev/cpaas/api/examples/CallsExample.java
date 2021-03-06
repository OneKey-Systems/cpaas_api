package mx.onekey.dev.cpaas.api.examples;

import mx.onekey.dev.cpaas.api.configuration.BasicZangConfiguration;
import mx.onekey.dev.cpaas.api.connectors.CallsConnector;
import mx.onekey.dev.cpaas.api.connectors.ZangConnectorFactory;
import mx.onekey.dev.cpaas.api.domain.Call;

import mx.onekey.dev.cpaas.api.domain.list.CallsList;
import mx.onekey.dev.cpaas.api.exceptions.ZangException;
import mx.onekey.dev.cpaas.api.inboundxml.elements.enums.RecordingFileFormat;
import mx.onekey.dev.cpaas.api.params.MakeCallParams;
import mx.onekey.dev.cpaas.api.testutil.TestParameters;
import mx.onekey.dev.cpaas.api.domain.enums.*;

public class CallsExample {

    public static void main(String[] args) {
        BasicZangConfiguration conf = new BasicZangConfiguration();
        conf.setSid("{AccountSid}");
        conf.setAuthToken("{AuthToken}");
        CallsConnector connector = ZangConnectorFactory.getCallsConnector(conf);

        //view call
        try {
            Call call = connector.viewCall("TestCallSid");
            System.out.println(call.getDuration());
        } catch (ZangException e) {
            e.printStackTrace();
        }


        // list calls
        try {
            CallsList callsList = connector.listCalls(
                    "+123456",
                    "+654321",
                    CallStatus.COMPLETED,
                    TestParameters.getFromDate(),
                    TestParameters.getToDate(),
                    0,
                    10);
            System.out.println(callsList.getTotal());
        } catch (ZangException e) {
            e.printStackTrace();
        }

        //make call
        try {
            MakeCallParams makeCallParams = MakeCallParams.builder()
                    .setTo("+123456")
                    .setFrom("+654321")
                    .setUrl("TestUrl")
                    .setMethod(HttpMethod.GET)
                    .setFallbackUrl("FallbackUrl")
                    .setFallbackMethod(HttpMethod.POST)
                    .setStatusCallback("StatusCallback")
                    .setStatusCallbackMethod(HttpMethod.GET)
                    .setHeartbeatUrl("HeartbeatUrl")
                    .setHeartbeatMethod(HttpMethod.GET)
                    .setForwardedFrom("1234")
                    .setPlayDtmf("123#")
                    .setTimeout(122)
                    .setHideCallerId(true)
                    .setRecord(true)
                    .setRecordCallback("RecordCallback")
                    .setRecordCallbackMethod(HttpMethod.GET)
                    .setTranscribe(true)
                    .setTranscribeCallback("TranscribeCallback")
                    .setStraightToVoicemail(true)
                    .setIfMachine(IfMachine.REDIRECT)
                    .setIfMachineUrl("IfMachineUrl")
                    .setIfMachineMethod(HttpMethod.GET)
                    .setSipAuthUsername("username")
                    .setSipAuthPassword("password")
                    .build();
            Call call = connector.makeCall(makeCallParams);
            System.out.println(call.getSid());
        } catch (ZangException e) {
            e.printStackTrace();
        }

        //interrupt live call
        try {
            Call call = connector.interruptLiveCall("TestCallSid", "TestUrl", HttpMethod.GET, EndCallStatus.CANCELED);
            System.out.println(call.getStatus());
        } catch (ZangException e) {
            e.printStackTrace();
        }


        //send digits to live call
        try {
            Call call = connector.sendDigitsToLiveCall("TestCallSid", "0123#", AudioDirection.OUT);
            System.out.println(call.getStatus());
        } catch (ZangException e) {
            e.printStackTrace();
        }


        //record live call
        try {
            Call call = connector.recordLiveCall("TestCallSid", true, RecordingAudioDirection.BOTH, 15, "TestUrl",
                    RecordingFileFormat.MP3, true, true, TranscriptionQuality.HYBRID, "TestTranscribeUrl");
            System.out.println(call.getStatus());
        } catch (ZangException e) {
            e.printStackTrace();
        }


        //play audio to live call
        try {
            Call call = connector.playAudioToLiveCall("TestCallSid", "AudioUrl", RecordingAudioDirection.BOTH, true);
            System.out.println(call.getStatus());
        } catch (ZangException e) {
            e.printStackTrace();
        }


        //apply voice effect
        try {
            Call call = connector.applyVoiceEffect("TestCallSid", AudioDirection.OUT, 5.0, 4.0, 3.0, 2.0, 1.0);
            System.out.println(call.getStatus());
        } catch (ZangException e) {
            e.printStackTrace();
        }
    }
}
