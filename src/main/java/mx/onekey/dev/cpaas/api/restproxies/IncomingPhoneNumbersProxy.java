package mx.onekey.dev.cpaas.api.restproxies;

import mx.onekey.dev.cpaas.api.domain.enums.HttpMethod;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

public interface IncomingPhoneNumbersProxy {
    @GET
    @Path("Accounts/{AccountSid}/IncomingPhoneNumbers/{IncomingPhoneNumberSid}.json")
    @Produces("application/json")
    Response viewIncomingNumber(
            @PathParam("AccountSid") String accountSid,
            @PathParam("IncomingPhoneNumberSid") String incomingPhoneNumberSid
    );

    @GET
    @Path("Accounts/{AccountSid}/IncomingPhoneNumbers.json")
    @Produces("application/json")
    Response listIncomingNumbers(
            @PathParam("AccountSid") String accountSid,
            @QueryParam("Contains") String contains,
            @QueryParam("FriendlyName") String friendlyName,
            @QueryParam("Page") Integer page,
            @QueryParam("PageSize") Integer pageSize

    );

    @POST
    @Path("Accounts/{AccountSid}/IncomingPhoneNumbers.json")
    @Produces("application/json")
    Response purchaseIncomingNumber(
            @PathParam("AccountSid") String accountSid,
            @FormParam("FriendlyName") String friendlyName,
            @FormParam("PhoneNumber") String phoneNumber,
            @FormParam("AreaCode") String areaCode,
            @FormParam("VoiceCallerIdLookup") Boolean voiceCallerIdLookup,
            @FormParam("VoiceApplicationSid") String voiceApplicationSid,
            @FormParam("SmsApplicationSid") String smsApplicationSid,
            @FormParam("VoiceUrl") String voiceUrl,
            @FormParam("VoiceMethod") mx.onekey.dev.cpaas.api.domain.enums.HttpMethod voiceMethod,
            @FormParam("VoiceFallbackUrl") String voiceFallbackUrl,
            @FormParam("VoiceFallbackMethod") mx.onekey.dev.cpaas.api.domain.enums.HttpMethod voiceFallbackMethod,
            @FormParam("SmsUrl") String smsUrl,
            @FormParam("SmsMethod") mx.onekey.dev.cpaas.api.domain.enums.HttpMethod smsMethod,
            @FormParam("SmsFallbackUrl") String smsFallbackUrl,
            @FormParam("SmsFallbackMethod") mx.onekey.dev.cpaas.api.domain.enums.HttpMethod smsFallbackMethod,
            @FormParam("HeartbeatUrl") String heartbeatUrl,
            @FormParam("HeartbeatMethod") mx.onekey.dev.cpaas.api.domain.enums.HttpMethod heartbeatMethod,
            @FormParam("StatusCallback") String statusCallback,
            @FormParam("StatusCallbackMethod") mx.onekey.dev.cpaas.api.domain.enums.HttpMethod statusCallbackMethod,
            @FormParam("HangupCallback") String hangupCallback,
            @FormParam("HangupCallbackMethod") mx.onekey.dev.cpaas.api.domain.enums.HttpMethod hangupCallbackMethod
    );

    @POST
    @Path("Accounts/{AccountSid}/IncomingPhoneNumbers/{IncomingPhoneNumberSid}.json")
    @Produces("application/json")
    Response updateIncomingNumber(
            @PathParam("AccountSid") String accountSid,
            @PathParam("IncomingPhoneNumberSid") String incomingPhoneNumberSid,
            @FormParam("FriendlyName") String friendlyName,
            @FormParam("VoiceCallerIdLookup") Boolean voiceCallerIdLookup,
            @FormParam("VoiceUrl") String voiceUrl,
            @FormParam("VoiceMethod") mx.onekey.dev.cpaas.api.domain.enums.HttpMethod voiceMethod,
            @FormParam("VoiceFallbackUrl") String voiceFallbackUrl,
            @FormParam("VoiceFallbackMethod") mx.onekey.dev.cpaas.api.domain.enums.HttpMethod voiceFallbackMethod,
            @FormParam("SmsUrl") String smsUrl,
            @FormParam("SmsMethod") mx.onekey.dev.cpaas.api.domain.enums.HttpMethod smsMethod,
            @FormParam("SmsFallbackUrl") String smsFallbackUrl,
            @FormParam("SmsFallbackMethod") mx.onekey.dev.cpaas.api.domain.enums.HttpMethod smsFallbackMethod,
            @FormParam("HeartbeatUrl") String heartbeatUrl,
            @FormParam("HeartbeatMethod") mx.onekey.dev.cpaas.api.domain.enums.HttpMethod heartbeatMethod,
            @FormParam("StatusCallback") String statusCallback,
            @FormParam("StatusCallbackMethod") mx.onekey.dev.cpaas.api.domain.enums.HttpMethod statusCallbackMethod,
            @FormParam("HangupCallback") String hangupCallback,
            @FormParam("HangupCallbackMethod") HttpMethod hangupCallbackMethod
    );

    @DELETE
    @Path("Accounts/{AccountSid}/IncomingPhoneNumbers/{IncomingPhoneNumberSid}.json")
    @Produces("application/json")
    Response deleteIncomingNumber(
            @PathParam("AccountSid") String accountSid,
            @PathParam("IncomingPhoneNumberSid") String incomingPhoneNumberSid
    );
}

