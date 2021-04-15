package mx.onekey.dev.cpaas.api.unit;

import mx.onekey.dev.cpaas.api.connectors.IncomingPhoneNumbersConnector;
import mx.onekey.dev.cpaas.api.domain.IncomingPhoneNumber;
import mx.onekey.dev.cpaas.api.domain.enums.HttpMethod;
import mx.onekey.dev.cpaas.api.exceptions.ZangException;
import mx.onekey.dev.cpaas.api.params.PurchaseIncomingNumberParams;
import mx.onekey.dev.cpaas.api.params.UpdateIncomingNumberParams;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class IncomingPhoneNumbersTest extends BaseUnitTest {

    private IncomingPhoneNumbersConnector connector;

    @Before
    public void initConnector() {
        connector = connectorFactory.getIncomingPhoneNumbersConnector();
    }


    @Test
    public void viewIncomingPhoneNumber() throws ZangException, IOException {
        createExpectation("IncomingPhoneNumbersTest", "viewIncomingPhoneNumber");
        check(connector.viewIncomingNumber("TestIncomingPhoneNumberSid"));
    }

    @Test
    public void listIncomingPhoneNumbers() throws ZangException, IOException {
        createExpectation("IncomingPhoneNumbersTest", "listIncomingPhoneNumbers");
        check(connector.listIncomingNumbers("123", "MyNumber", 0, 25)
                .iterator().next());

    }

    @Test
    public void purchaseIncomingPhoneNumber() throws ZangException, IOException {
        createExpectation("IncomingPhoneNumbersTest", "purchaseIncomingPhoneNumber");
        check(connector.purchaseIncomingNumber(PurchaseIncomingNumberParams.builder()
                .setFriendlyName("MyNumber")
                .setPhoneNumber("+1234")
                .setAreaCode("123")
                .setVoiceCallerIdLookup(true)
                .setVoiceApplicationSid("VoiceApplicationSid")
                .setSmsApplicationSid("SmsApplicationSid")
                .setVoiceUrl("VoiceUrl")
                .setVoiceMethod(HttpMethod.GET)
                .setVoiceFallbackUrl("VoiceFallbackUrl")
                .setVoiceFallbackMethod(HttpMethod.GET)
                .setSmsUrl("SmsUrl")
                .setSmsMethod(HttpMethod.GET)
                .setSmsFallbackUrl("SmsFallbackUrl")
                .setSmsFallbackMethod(HttpMethod.POST)
                .setHeartbeatUrl("HeartbeatUrl")
                .setHeartbeatMethod(HttpMethod.POST)
                .setStatusCallback("StatusCallback")
                .setStatusCallbackMethod(HttpMethod.POST)
                .setHangupCallback("HangupCallback")
                .setHangupCallbackMethod(HttpMethod.POST)
                .build()));
    }

    @Test
    public void updateIncomingPhoneNumber() throws ZangException, IOException {
        createExpectation("IncomingPhoneNumbersTest", "updateIncomingPhoneNumber");

        check(connector.updateIncomingNumber(UpdateIncomingNumberParams.builder()
                .setIncomingPhoneNumberSid("TestIncomingPhoneNumberSid")
                .setFriendlyName("MyNumber")
                .setVoiceCallerIdLookup(true)
                .setVoiceUrl("VoiceUrl")
                .setVoiceMethod(HttpMethod.GET)
                .setVoiceFallbackUrl("VoiceFallbackUrl")
                .setVoiceFallbackMethod(HttpMethod.GET)
                .setSmsUrl("SmsUrl")
                .setSmsMethod(HttpMethod.GET)
                .setSmsFallbackUrl("SmsFallbackUrl")
                .setSmsFallbackMethod(HttpMethod.POST)
                .setHeartbeatUrl("HeartbeatUrl")
                .setHeartbeatMethod(HttpMethod.POST)
                .setStatusCallback("StatusCallback")
                .setStatusCallbackMethod(HttpMethod.POST)
                .setHangupCallback("HangupCallback")
                .setHangupCallbackMethod(HttpMethod.POST)
                .build()));
    }

    @Test
    public void deleteIncomingPhoneNumber() throws ZangException, IOException {
        createExpectation("IncomingPhoneNumbersTest", "deleteIncomingPhoneNumber");
        check(connector.deleteIncomingNumber("TestIncomingPhoneNumberSid"));
    }

    private void check(IncomingPhoneNumber ipn) {

    }

}
