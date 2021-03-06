package mx.onekey.dev.cpaas.api.configuration;

/**
 * Provides a basic POJO-like implementation of ZangConfiguration.
 *
 * @see ZangConfiguration
 */
public class BasicZangConfiguration implements ZangConfiguration {

    private String sid;
    private String authToken;
    private String baseUrl = ZangConstants.BASE_URL;
    private String proxyHost;
    private String proxyPort;
    private String proxyProtocol;

    public BasicZangConfiguration() {

    }

    /**
     * @param sid       The account sid.
     * @param authToken The authorization token.
     */
    public BasicZangConfiguration(String sid, String authToken) {
        setSid(sid);
        setAuthToken(authToken);
    }

    @Override
    public String getSid() {
        return sid;
    }

    @Override
    public String getAuthToken() {
        return authToken;
    }

    @Override
    public String getBaseUrl() {
        return baseUrl;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @Override
    public String getProxyHost() {
        return proxyHost;
    }

    @Override
    public String getProxyPort() {
        return proxyPort;
    }

    @Override
    public String getProxyProtocol() {
        return proxyProtocol;
    }

    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    public void setProxyPort(String proxyPort) {
        this.proxyPort = proxyPort;
    }

    public void setProxyProtocol(String proxyProtocol) {
        this.proxyProtocol = proxyProtocol;
    }

}
