package mx.onekey.dev.cpaas.api.params;

import mx.onekey.dev.cpaas.api.domain.enums.HttpMethod;
import mx.onekey.dev.cpaas.api.connectors.IncomingPhoneNumbersConnector;

/**
 * Utility class for executing the Update Incoming Number request
 * @see IncomingPhoneNumbersConnector
 * @see UpdateIncomingNumberParamsBuilder
 */
public class UpdateIncomingNumberParams {
    private String accountSid;
    private String incomingPhoneNumberSid;
    private String friendlyName;
    private Boolean voiceCallerIdLookup;
    private String voiceUrl;
    private HttpMethod voiceMethod;
    private String voiceFallbackUrl;
    private HttpMethod voiceFallbackMethod;
    private String smsUrl;
    private HttpMethod smsMethod;
    private String smsFallbackUrl;
    private HttpMethod smsFallbackMethod;
    private String heartbeatUrl;
    private HttpMethod heartbeatMethod;
    private String statusCallback;
    private HttpMethod statusCallbackMethod;
    private String hangupCallback;
    private HttpMethod hangupCallbackMethod;

    public static UpdateIncomingNumberParamsBuilder builder() {
        return new UpdateIncomingNumberParamsBuilder();
    }

    /**
     * @see UpdateIncomingNumberParamsBuilder
     */
    public UpdateIncomingNumberParams() {
    }

    /**
     * @see UpdateIncomingNumberParamsBuilder
     */
    public UpdateIncomingNumberParams(String accountSid, String incomingPhoneNumberSid, String friendlyName, Boolean voiceCallerIdLookup, String voiceUrl, HttpMethod voiceMethod, String voiceFallbackUrl, HttpMethod voiceFallbackMethod, String smsUrl, HttpMethod smsMethod, String smsFallbackUrl, HttpMethod smsFallbackMethod, String heartbeatUrl, HttpMethod heartbeatMethod, String statusCallback, HttpMethod statusCallbackMethod, String hangupCallback, HttpMethod hangupCallbackMethod) {
        this.accountSid = accountSid;
        this.incomingPhoneNumberSid = incomingPhoneNumberSid;
        this.friendlyName = friendlyName;
        this.voiceCallerIdLookup = voiceCallerIdLookup;
        this.voiceUrl = voiceUrl;
        this.voiceMethod = voiceMethod;
        this.voiceFallbackUrl = voiceFallbackUrl;
        this.voiceFallbackMethod = voiceFallbackMethod;
        this.smsUrl = smsUrl;
        this.smsMethod = smsMethod;
        this.smsFallbackUrl = smsFallbackUrl;
        this.smsFallbackMethod = smsFallbackMethod;
        this.heartbeatUrl = heartbeatUrl;
        this.heartbeatMethod = heartbeatMethod;
        this.statusCallback = statusCallback;
        this.statusCallbackMethod = statusCallbackMethod;
        this.hangupCallback = hangupCallback;
        this.hangupCallbackMethod = hangupCallbackMethod;
    }


    public String getAccountSid() {
        return accountSid;
    }

    public void setAccountSid(String accountSid) {
        this.accountSid = accountSid;
    }

    public String getIncomingPhoneNumberSid() {
        return incomingPhoneNumberSid;
    }

    public void setIncomingPhoneNumberSid(String incomingPhoneNumberSid) {
        this.incomingPhoneNumberSid = incomingPhoneNumberSid;
    }

    public String getFriendlyName() {
        return friendlyName;
    }

    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    public Boolean getVoiceCallerIdLookup() {
        return voiceCallerIdLookup;
    }

    public void setVoiceCallerIdLookup(Boolean voiceCallerIdLookup) {
        this.voiceCallerIdLookup = voiceCallerIdLookup;
    }

    public String getVoiceUrl() {
        return voiceUrl;
    }

    public void setVoiceUrl(String voiceUrl) {
        this.voiceUrl = voiceUrl;
    }

    public HttpMethod getVoiceMethod() {
        return voiceMethod;
    }

    public void setVoiceMethod(HttpMethod voiceMethod) {
        this.voiceMethod = voiceMethod;
    }

    public String getVoiceFallbackUrl() {
        return voiceFallbackUrl;
    }

    public void setVoiceFallbackUrl(String voiceFallbackUrl) {
        this.voiceFallbackUrl = voiceFallbackUrl;
    }

    public HttpMethod getVoiceFallbackMethod() {
        return voiceFallbackMethod;
    }

    public void setVoiceFallbackMethod(HttpMethod voiceFallbackMethod) {
        this.voiceFallbackMethod = voiceFallbackMethod;
    }

    public String getSmsUrl() {
        return smsUrl;
    }

    public void setSmsUrl(String smsUrl) {
        this.smsUrl = smsUrl;
    }

    public HttpMethod getSmsMethod() {
        return smsMethod;
    }

    public void setSmsMethod(HttpMethod smsMethod) {
        this.smsMethod = smsMethod;
    }

    public String getSmsFallbackUrl() {
        return smsFallbackUrl;
    }

    public void setSmsFallbackUrl(String smsFallbackUrl) {
        this.smsFallbackUrl = smsFallbackUrl;
    }

    public HttpMethod getSmsFallbackMethod() {
        return smsFallbackMethod;
    }

    public void setSmsFallbackMethod(HttpMethod smsFallbackMethod) {
        this.smsFallbackMethod = smsFallbackMethod;
    }

    public String getHeartbeatUrl() {
        return heartbeatUrl;
    }

    public void setHeartbeatUrl(String heartbeatUrl) {
        this.heartbeatUrl = heartbeatUrl;
    }

    public HttpMethod getHeartbeatMethod() {
        return heartbeatMethod;
    }

    public void setHeartbeatMethod(HttpMethod heartbeatMethod) {
        this.heartbeatMethod = heartbeatMethod;
    }

    public String getStatusCallback() {
        return statusCallback;
    }

    public void setStatusCallback(String statusCallback) {
        this.statusCallback = statusCallback;
    }

    public HttpMethod getStatusCallbackMethod() {
        return statusCallbackMethod;
    }

    public void setStatusCallbackMethod(HttpMethod statusCallbackMethod) {
        this.statusCallbackMethod = statusCallbackMethod;
    }

    public String getHangupCallback() {
        return hangupCallback;
    }

    public void setHangupCallback(String hangupCallback) {
        this.hangupCallback = hangupCallback;
    }

    public HttpMethod getHangupCallbackMethod() {
        return hangupCallbackMethod;
    }

    public void setHangupCallbackMethod(HttpMethod hangupCallbackMethod) {
        this.hangupCallbackMethod = hangupCallbackMethod;
    }
}
