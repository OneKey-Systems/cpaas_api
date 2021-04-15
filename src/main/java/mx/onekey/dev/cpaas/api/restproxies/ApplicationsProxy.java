package mx.onekey.dev.cpaas.api.restproxies;

import mx.onekey.dev.cpaas.api.domain.enums.HttpMethod;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

public interface ApplicationsProxy {
    @GET
    @Path("Accounts/{AccountSid}/Applications/{ApplicationSid}.json")
    @Produces("application/json")
    Response viewApplication(@PathParam("AccountSid") String accountSid,
                             @PathParam("ApplicationSid") String applicationSid);

    @GET
    @Path("Accounts/{AccountSid}/Applications.json")
    @Produces("application/json")
    Response listApplications(@PathParam("AccountSid") String accountSid,
                              @QueryParam("FriendlyName") String friendlyName,
                              @QueryParam("Page") Integer page,
                              @QueryParam("PageSize") Integer pageSize);

    @POST
    @Path("Accounts/{AccountSid}/Applications.json")
    @Produces("application/json")
    Response createApplication(@PathParam("AccountSid") String accountSid,
                               @FormParam("FriendlyName") String friendlyName,
                               @FormParam("VoiceUrl") String voiceUrl,
                               @FormParam("VoiceMethod") mx.onekey.dev.cpaas.api.domain.enums.HttpMethod voiceMethod,
                               @FormParam("VoiceFallbackUrl") String voiceFallbackUrl,
                               @FormParam("VoiceFallbackMethod") mx.onekey.dev.cpaas.api.domain.enums.HttpMethod voiceFallbackMethod,
                               @FormParam("VoiceCallerIdLookup") Boolean voiceCallerIdLookup,
                               @FormParam("SmsUrl") String smsUrl,
                               @FormParam("SmsMethod") mx.onekey.dev.cpaas.api.domain.enums.HttpMethod smsMethod,
                               @FormParam("SmsFallbackUrl") String smsFallbackUrl,
                               @FormParam("SmsFallbackMethod") mx.onekey.dev.cpaas.api.domain.enums.HttpMethod smsFallbackMethod,
                               @FormParam("HeartbeatUrl") String heartbeatUrl,
                               @FormParam("HeartbeatMethod") mx.onekey.dev.cpaas.api.domain.enums.HttpMethod heartbeatMethod,
                               @FormParam("StatusCallback") String statusCallback,
                               @FormParam("StatusCallbackMethod") mx.onekey.dev.cpaas.api.domain.enums.HttpMethod statusCallbackMethod,
                               @FormParam("HangupCallback") String handupCallback,
                               @FormParam("HangupCallbackMethod") mx.onekey.dev.cpaas.api.domain.enums.HttpMethod hangupCallbackMethod);

    @POST
    @Path("Accounts/{AccountSid}/Applications/{ApplicationSid}.json")
    @Produces("application/json")
    Response updateApplication(@PathParam("AccountSid") String accountSid,
                               @PathParam("ApplicationSid") String applicationSid,
                               @FormParam("FriendlyName") String friendlyName,
                               @FormParam("VoiceUrl") String voiceUrl,
                               @FormParam("VoiceMethod") mx.onekey.dev.cpaas.api.domain.enums.HttpMethod voiceMethod,
                               @FormParam("VoiceFallbackUrl") String voiceFallbackUrl,
                               @FormParam("VoiceFallbackMethod") mx.onekey.dev.cpaas.api.domain.enums.HttpMethod voiceFallbackMethod,
                               @FormParam("VoiceCallerIdLookup") Boolean voiceCallerIdLookup,
                               @FormParam("SmsUrl") String smsUrl,
                               @FormParam("SmsMethod") mx.onekey.dev.cpaas.api.domain.enums.HttpMethod smsMethod,
                               @FormParam("SmsFallbackUrl") String smsFallbackUrl,
                               @FormParam("SmsFallbackMethod") mx.onekey.dev.cpaas.api.domain.enums.HttpMethod smsFallbackMethod,
                               @FormParam("HeartbeatUrl") String heartbeatUrl,
                               @FormParam("HeartbeatMethod") mx.onekey.dev.cpaas.api.domain.enums.HttpMethod heartbeatMethod,
                               @FormParam("StatusCallback") String statusCallback,
                               @FormParam("StatusCallbackMethod") mx.onekey.dev.cpaas.api.domain.enums.HttpMethod statusCallbackMethod,
                               @FormParam("HangupCallback") String handupCallback,
                               @FormParam("HangupCallbackMethod") HttpMethod hangupCallbackMethod);

    @DELETE
    @Path("Accounts/{AccountSid}/Applications/{ApplicationSid}.json")
    @Produces("application/json")
    Response deleteApplication(@PathParam("AccountSid") String accountSid,
                               @PathParam("ApplicationSid") String applicationSid);
}

